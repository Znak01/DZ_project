package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> ageList = new ArrayList<>();
		for (int i = 15; i < 61; i++) {
			String n = Integer.toString(i);
			ageList.add(n);
		}
		for (String string : ageList) {
			System.out.println(string);
		}
	}
	
}
