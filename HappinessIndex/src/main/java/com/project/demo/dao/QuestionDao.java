package com.project.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.model.Question;

public interface QuestionDao extends CrudRepository<Question, Integer>{

	
}
