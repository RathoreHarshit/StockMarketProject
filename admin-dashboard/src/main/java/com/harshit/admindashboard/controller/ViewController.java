package com.harshit.admindashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/admin-home")
	public String dashboard() {
		return "admindash";
	}
}
