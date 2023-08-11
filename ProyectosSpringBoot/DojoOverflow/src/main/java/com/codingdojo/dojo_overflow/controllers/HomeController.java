package com.codingdojo.dojo_overflow.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.dojo_overflow.models.Answer;
import com.codingdojo.dojo_overflow.models.Question;
import com.codingdojo.dojo_overflow.models.Tag;
import com.codingdojo.dojo_overflow.services.AnswerService;
import com.codingdojo.dojo_overflow.services.QuestionService;
import com.codingdojo.dojo_overflow.services.TagService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	private AnswerService answerService;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private TagService tagService;

	@GetMapping("/questions")
	public String dashboard(Model model, HttpSession session) {
		session.invalidate();
		List<Question> questions = questionService.findAll();
		model.addAttribute("questions", questions);
		return "shows/dashboard.jsp";
	}

	@GetMapping("/questions/{id}")
	public String search(Model model, @PathVariable("id") Long id, @ModelAttribute("newAnswer") Answer answer) {
		Question question = questionService.findById(id);
		List<Tag> tags = tagService.findTagByQuestion(question);
		List<Answer> answers = answerService.findByQuestion(question);
		model.addAttribute("tags", tags);
		model.addAttribute("question", question);
		model.addAttribute("answers", answers);
		return "shows/questions.jsp";
	}
	
	@PostMapping("/questions/{id1}")
	public String createAnswer(@Valid @ModelAttribute("newAnswer") Answer answer, 
			BindingResult result, Model model, @PathVariable("id1") Long id, HttpSession session) {
		if (result.hasErrors()) {
			session.setAttribute("error", "La respuesta no puede tener menos de 2 caracteres");
			
			return "redirect:/questions/" + id;
		} else {
			session.invalidate();
			Question question = questionService.findById(id);
			answer.setQuestion(question);
			answerService.createAnswer(answer);	
			return "redirect:/questions/"+id;
		}
	}

	@GetMapping("/questions/new")
	public String newQuestion(@ModelAttribute("newQuestion") Question question) {
		return "shows/new.jsp";
	}

	@PostMapping("/questions/new")
	public String createQuestion(@Valid @ModelAttribute("newQuestion") Question question, BindingResult result,
			Model model, @RequestParam("tagString") String tagString) {
		String[] tagNames = tagString.split(",");
		List<Tag> tags = new ArrayList<>();
		
		if(tagString.isEmpty() ){
			result.rejectValue("tags", "No pueden ser mas de 3 tags");
			model.addAttribute("errorTags", "El campo no puede estar vacio y no pueden ser mas de 3 tags");
		}
		
		if(tagNames.length > 3){
			result.rejectValue("tags", "No pueden ser mas de 3 tags");
			model.addAttribute("errorTags", "No pueden ser mas de 3 tags");
		}
		
		if (result.hasErrors()) {
			model.addAttribute("errors", "Los campos no pueden estar vacios y Deben haber maximo 3 Tags Separados por (,)");
			return "shows/new.jsp"; 
			} 
		else {
			for (String tagName : tagNames) {
				List<Tag> existingTags = tagService.findBySubject(tagName.trim());

				if (existingTags.isEmpty()) {
					Tag newTag = new Tag();
					newTag.setSubject(tagName.trim());
					tagService.createTag(newTag);
					tags.add(newTag);
				} else {
					tags.addAll(existingTags);
				}
			}
			question.setTags(tags);
			questionService.createQuestion(question);
			return "redirect:/questions/new";
		}
	}

}
