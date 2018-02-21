package ua.online.courses.controller;

import java.math.BigDecimal;

import org.aspectj.lang.annotation.Pointcut;
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
import ua.online.courses.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping("/add")
	public String showItemAddForm() {
		return "item/add-item";
	}
	
	@GetMapping("/list")
	public String showItemList(Model model) {
		model.addAttribute("itemList", itemService.findAllItems());
		return "item/item-list";
	}
	
	
	@PostMapping("/add")
	public String saveItem(
			@RequestParam("name") String name,
			@RequestParam("price") BigDecimal price
			) {
		System.out.println(name + " " + price);
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		
		itemService.save(item);
		
		return "redirect:/item/list";
	}
	
	
	
	@GetMapping("/item")
	public String showItem(Model model, @PathVariable("itemId") int id) {
		Item item = itemService.findById(id);
		model.addAttribute("item", item);
		System.out.println(item);
		return "item/item";
	}
	
}
