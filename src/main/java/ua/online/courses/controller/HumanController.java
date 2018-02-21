package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.entity.Degree;
import ua.online.courses.entity.Human;
import ua.online.courses.service.HumanService;

@Controller
@RequestMapping("/human")
public class HumanController {

	private HumanService humanService;
	
	@GetMapping("/add")
	public String showAddHumanPage(Model model) {
		
		LinkedHashMap<String, String> ageList2 = new LinkedHashMap<>();
//		List<String> ageList2 = new ArrayList<>();
		for (int i = 15; i < 61; i++) {
			String n = Integer.toString(i);
//			ageList2.add(n);
			ageList2.put(n, n);
		}
		
		LinkedHashMap<String, String> countryList = new LinkedHashMap<>();
		countryList.put("UKR", "Ukraine");
		countryList.put("RU", "Russian");
		countryList.put("UA", "Unitet State");
		countryList.put("UK", "England");
		
		List<String> gender = new ArrayList<>();
		gender.add("MAN");
		gender.add("WOMAN");
		
		List<String> programmingLanguegList3 = new ArrayList<>();
		programmingLanguegList3.add("Java");
		programmingLanguegList3.add("C#");
		programmingLanguegList3.add("C++");
		programmingLanguegList3.add("PHP");
		programmingLanguegList3.add("Ruby");
		
		List<String> exList4 = new ArrayList<>();
		exList4.add("1 year");
		exList4.add("2 year");
		exList4.add("3 year");
		exList4.add("+100500 year");
		
		List<String> rangList5 = new ArrayList<>();
		rangList5.add("Junior");
		rangList5.add("Senior");
		rangList5.add("Middle");
		rangList5.add("Master");
		
		List<String> searchList6 = new ArrayList<>();
		searchList6.add("Google");
		searchList6.add("Social Net");
		searchList6.add("Friends");
		searchList6.add("Add");
		
		List<String> normList7 = new ArrayList<>();
		normList7.add("YES");
		normList7.add("NO");
		
		
		model.addAttribute("normList7", normList7);
		model.addAttribute("searchList6", searchList6);
		model.addAttribute("rangList5", rangList5);
		model.addAttribute("exList4", exList4);
		model.addAttribute("programmingLanguegList3", programmingLanguegList3);
		model.addAttribute("degree", Degree.values());
		model.addAttribute("gender", gender);
		model.addAttribute("countryList", countryList);
		model.addAttribute("ageList2", ageList2);
		model.addAttribute("humanModel", new Human());
		return "human/add";
	}
	
	@PostMapping("/add")
	public String save(@ModelAttribute("humanModel")
	        Human human) {
		humanService.saveHuman(human);
		return "redirect:/human/list";
	}
	
	@GetMapping("/list")
	public String showHumanList(Model model) {
		model.addAttribute("humanList", humanService.findAllItems());
		return "human/list";
	}
	
}
