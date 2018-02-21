package ua.online.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {


	@GetMapping("/")
	public String showHome(Model model) {
		return "home";
	}

	@GetMapping("/info")
	public String info(Model model) {
		model.addAttribute("title", "Infor page");
		return "human/add";
	}
	
	@GetMapping("/adminMain")
	public String adminInfo(Model model) {
		model.addAttribute("title", "Infor page");
		return "admin/adminMain";
	}
	
	@GetMapping("/userMain")
	public String userInfo(Model model) {
		model.addAttribute("title", "Infor page");
		return "user/userMain";
	}
	
	
	@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("title", "Login page");
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegisterForm(Model model) {
		model.addAttribute("title", "Register page");
		return "register";
	}
	
	
	
}
