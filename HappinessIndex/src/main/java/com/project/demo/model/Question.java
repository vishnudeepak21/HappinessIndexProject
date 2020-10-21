package com.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	int id;
	String Sprint;
	String QuestionDesc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSprint() {
		return Sprint;
	}
	public void setSprint(String sprint) {
		Sprint = sprint;
	}
	public String getQuestionDesc() {
		return QuestionDesc;
	}
	public void setQuestionDesc(String questionDesc) {
		QuestionDesc = questionDesc;
	}
	
}
