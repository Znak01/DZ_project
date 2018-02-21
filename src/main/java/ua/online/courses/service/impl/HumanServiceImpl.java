package ua.online.courses.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Human;
import ua.online.courses.repository.HumanRepository;
import ua.online.courses.service.HumanService;

@Service
public class HumanServiceImpl implements HumanService {

	private HumanRepository humanRepository;
	
	
	@Autowired
	public HumanServiceImpl(HumanRepository humanRepository) {
		super();
		this.humanRepository = humanRepository;
	}

	@Override
	public void saveHuman(Human human) {
		humanRepository.save(human);
	}

	@Override
	public List<Human> findAllItems() {
		return humanRepository.findAll();
	}

	
	
}
