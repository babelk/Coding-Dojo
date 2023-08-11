package com.codingdojo.dojo_overflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojo_overflow.models.Answer;
import com.codingdojo.dojo_overflow.models.Question;
import com.codingdojo.dojo_overflow.repositories.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;
	
	public void createAnswer(Answer answer) {

		answerRepository.save(answer);
	}
	
	public List<Answer> findByQuestion(Question question) {
		return answerRepository.findByQuestion(question);
	}
}
