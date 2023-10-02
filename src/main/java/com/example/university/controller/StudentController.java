package com.example.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
	
	@RequestMapping("/hello")
	public String display(Model theModel) {
			return "studTemplate";
		}
	
}
