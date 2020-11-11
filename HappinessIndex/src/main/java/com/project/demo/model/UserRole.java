package com.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRole {
	
	@Id
	int codeId;
	
	int userId;
	
	int formId;
	
	String userRole;
	
	String secretCode;

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}

	@Override
	public String toString() {
		return "UserRole [codeId=" + codeId + ", userId=" + userId + ", formId=" + formId + ", userRole=" + userRole
				+ ", secretCode=" + secretCode + "]";
	}
	
	
	

}
