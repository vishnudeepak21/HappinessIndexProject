package com.project.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.model.Feedback;

public interface FeedbackDao extends CrudRepository<Feedback,Integer>{

}
