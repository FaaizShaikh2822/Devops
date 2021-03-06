package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.User;
import com.test.service.UserService;

@Controller
public class homeController 
{
	@Autowired
	UserService userservice;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("message", "devops project");
		return"index";
	}
	@RequestMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("k", "welcome to login page");
		return"login";
	}
	

	@RequestMapping("/register")
	public String register(Model model)
	{
		User user=new User();
		model.addAttribute("reg", "welcome to register page");
		model.addAttribute("User", user);
		return "register";
		
	}
	
	@RequestMapping("/Category")
	public String Category(Model model)
	{
		model.addAttribute("cat", "Choose Category");
		return "Category";
	}
}
