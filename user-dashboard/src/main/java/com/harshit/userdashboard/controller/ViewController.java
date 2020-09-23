package com.harshit.userdashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/user-home")
	public String dashboard() {
		return "userdash";
	}
}
