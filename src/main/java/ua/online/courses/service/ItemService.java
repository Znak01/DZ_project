package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.Item;

public interface ItemService {

	void save(Item item);
	
	List<Item> findAllItems();
	
	Item findById(int id);
	
	void deleteItemById(int id);
	
}
