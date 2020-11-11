package com.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	int id;
	String QuestionDesc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getQuestionDesc() {
		return QuestionDesc;
	}
	public void setQuestionDesc(String questionDesc) {
		QuestionDesc = questionDesc;
	}
	
}
