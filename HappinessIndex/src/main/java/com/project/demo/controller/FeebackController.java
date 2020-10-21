package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.demo.dao.EmployeeDao;
import com.project.demo.dao.FeedbackDao;
import com.project.demo.dao.QuestionDao;
import com.project.demo.model.Employee;
import com.project.demo.model.Feedback;
import com.project.demo.model.Question;

@Controller
public class FeebackController {
	
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	FeedbackDao feedbackDao;
	
	@Autowired
	QuestionDao questionDao;
	
	@RequestMapping("/")
	public String feedback() {
		return "login.jsp";
	}
	
	@RequestMapping("/addFeedback")
	public String addFeedback(Feedback feedback) {
		feedbackDao.save(feedback);
		return "thankyou.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		employeeDao.save(employee);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/addQuestion")
	public String addQuestion(Question question) {
		questionDao.save(question);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/gotoAddEmployee")
	public String gotoCreateEmployee() {
		return "createemployee.jsp";
	}
	
	@RequestMapping("/gotoAddQuestion")
	public String gotoAddQuestion() {
		return "createquestion.jsp";
	}
	
	@RequestMapping("/loginMember")
	public String loginMember() {
		return "feedback.jsp";
	}
	
	@RequestMapping("/loginLead")
	public String loginLead() {
		return "dashboard.jsp";
	}
	
	@RequestMapping("/logOut")
	public String logOut() {
		return "login.jsp";
	}
	
}
