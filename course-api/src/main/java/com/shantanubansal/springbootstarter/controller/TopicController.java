package com.shantanubansal.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shantanubansal.models.RestfulResponse;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("topics")
	public String getAllTopics() {
		return topicService.getTopics();
	}

	@RequestMapping("topics/{id}")
	public String getTopic(@PathVariable String id) {
		return topicService.getSingleTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public RestfulResponse addTopic(@RequestBody RestfulResponse restfulRequest) {
		topicService.setTopics((String) restfulRequest.getData());
		return null;
	}
	
}
