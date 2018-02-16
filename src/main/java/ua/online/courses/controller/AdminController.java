package ua.online.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.service.UserService;
import ua.online.courses.entity.User;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserService userService; 
	
	@GetMapping("/user")
	public String showUserProf(Model model, @PathVariable("userId") int id) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		System.out.println(user);
		
		return "user/user";
	}
	
//	public String sendUserEmail() {
//		
//	}
	
//	public String blockUser() {
//		
//	}
	
}
