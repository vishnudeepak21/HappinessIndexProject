package com.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Form {
	
	@Id
	int id;
	
	String creator;
	
	String createdOn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Form [id=" + id + ", creator=" + creator + ", createdOn=" + createdOn + "]";
	}
	
	
	

}
