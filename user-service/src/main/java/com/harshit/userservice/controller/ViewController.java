package com.harshit.userservice.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.harshit.userservice.service.UserService;

@Controller
@Transactional
public class ViewController {
	
	
	private UserService userService;

	public ViewController(UserService userService) {
		this.userService=userService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "mvclogin";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {

		if (!userService.isValid(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "mvclogin";
		}

		model.put("name", name);
		if(userService.getType(name).equals("admin"))
		return "adminwelcome";
		else return "userwelcome";
	}
	
}
