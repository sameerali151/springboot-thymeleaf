package com.learn.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.thymeleaf.repositories.UserRepository;

@Controller
public class HomeController
{
	@Autowired UserRepository userRepo;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", userRepo.findAll());
		return "index";
	}
}
