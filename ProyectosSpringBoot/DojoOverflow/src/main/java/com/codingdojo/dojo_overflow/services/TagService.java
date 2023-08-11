package com.codingdojo.dojo_overflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojo_overflow.models.Question;
import com.codingdojo.dojo_overflow.models.Tag;
import com.codingdojo.dojo_overflow.repositories.TagRepository;

@Service
public class TagService {
	
	@Autowired
	private TagRepository tagRepository;

	public List<Tag> findAll() {

		return tagRepository.findAll();
	}
	
	public List<Tag> findTagByQuestion(Question question) {

		return tagRepository.findByQuestions(question);
	}
	
	public Tag createTag(Tag tag) {
        return tagRepository.save(tag);
    }
	
	public List<Tag> findBySubject(String subject) {
        return tagRepository.findBySubject(subject);
    }
}
