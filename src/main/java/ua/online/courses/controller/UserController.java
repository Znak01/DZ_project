package ua.online.courses.controller;

import java.math.BigDecimal;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ua.online.courses.entity.Item;
import ua.online.courses.entity.User;
import ua.online.courses.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService; 
	
	@GetMapping("/user")
	public String showUserProf(Model model, @PathVariable("userId") int id) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		System.out.println(user);
		
		return "user/userMain";
	}
	
	@GetMapping("/list")
	public String showItemList(Model model) {
		model.addAttribute("userList", userService.findAllUsers());
		return "user/profile/user-list";
	}
	
	@GetMapping("/{userId}/edit")
	public String editItem(Model model, @PathVariable("userId") int id) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		System.out.println(user);
		
		return "user/profile/edit-user";
	}
	
	@PostMapping("{userId}/edit")
	public String editItem(@ModelAttribute("user") User user) {
		userService.save(user);
		return "redirect:/user/list";
	}
	
	@GetMapping("/add")
	public String showUserRegister() {
		return "register";
	}
	
	@PostMapping("/add")
	public String saveUser(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("login") String login,
			@RequestParam("password") String password,
			@RequestParam("email") String email,
			@RequestParam("age") int age
			) {
		System.out.println(firstName + " " + lastName + " " + login + " " + password + " " + email + " " + age);
//		User user = new User();
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setLogin(login);
//		user.setPassword(password);
//		user.setEmail(email);
//		user.setAge(age);
//		
//		userService.save(user);
		
		return "redirect:/";
	}
	
//	public String showHistory() {
//		
//	}
	
}
