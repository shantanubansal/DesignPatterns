package com.shantanubansal.springbootstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shantanubansal.models.RestfulResponse;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public RestfulResponse Hello() {
		
		return new RestfulResponse();
	}
}
