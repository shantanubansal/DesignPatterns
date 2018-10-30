package com.shantanubansal.springbootstarter.controller;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private String topics = "Get All Topics";
	private String singleTopic = "1";
	public String getTopics() {
		return topics;
	}
	
	public String getSingleTopic(String id) {
		return id;
	}
	
	public void setTopics(String topic) {
		this.topics = topic;
	}
}
