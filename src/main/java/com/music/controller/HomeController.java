package com.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/good")
	public String testrun() {
		return "hello";
	}
	
	@GetMapping("/welcome")
	public String homePage() {
		return "welcome";
	}
}
