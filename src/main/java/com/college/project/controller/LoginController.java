package com.college.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


	@RequestMapping("/showMyLoginPage")
	public String showHome()
	{
		
		return "login";
	}
}
