package ua.online.courses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Item;
import ua.online.courses.repository.ItemRepository;
import ua.online.courses.service.ItemService;

@Service
public class ItemImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void save(Item item) {
		itemRepository.save(item);
	}

	@Override
	public List<Item> findAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public Item findById(int id) {
		return itemRepository.findOne(id);
	}

	@Override
	public void deleteItemById(int id) {
		itemRepository.delete(id);
		
	}

	
	
}
