package ua.online.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import ua.online.courses.service.ItemService;
import ua.online.courses.service.UserService;
import ua.online.courses.entity.Item;
import ua.online.courses.entity.User;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserService userService; 
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/user")
	public String showUserProf(Model model, @PathVariable("userId") int id) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		System.out.println(user);
		
		return "user/userMain";
	}
	
	@GetMapping("/item-list")
	public String showItemList(Model model) {
		model.addAttribute("itemList", itemService.findAllItems());
		return "admin/admin-item-list";
	}
	
	@GetMapping("/{itemId}/delete")
	public String deleteItem(@PathVariable("itemId") int itemId) {
		itemService.deleteItemById(itemId);
		return "redirect:/admin/item-list";
	}
	
	@GetMapping("/{itemId}/edit")
	public String editItem(Model model, @PathVariable("itemId") int id) {
		Item item = itemService.findById(id);
		model.addAttribute("item", item);
		System.out.println(item);
		
		return "item/edit-item";
	}
	
	@PostMapping("{itemId}/edit")
	public String editItem(@ModelAttribute("item") Item item) {
		itemService.save(item);
		return "redirect:/admin/item-list";
	}
	
//	public String sendUserEmail() {
//		
//	}
	
//	public String blockUser() {
//		
//	}
	
}
