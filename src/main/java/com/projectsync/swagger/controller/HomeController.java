package com.projectsync.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeMessage() {
		return "hello, world";
	}

	@RequestMapping(value = "/secret", method = RequestMethod.GET)
	public String secretMessage() {
		return "This is the new secret message";
	}

}
