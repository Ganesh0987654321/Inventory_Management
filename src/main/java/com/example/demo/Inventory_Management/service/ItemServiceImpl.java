package com.example.demo.Inventory_Management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Inventory_Management.entities.Item;
import com.example.demo.Inventory_Management.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemServiceI{
	
	
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public Item saveItem(Item item) {
		Item saveItem = itemRepository.save(item);
		return saveItem;
	}

	@Override
	public List<Item> getAllItem() {
		List<Item> findAllItem = itemRepository.findAll();
		return findAllItem;
	}

	@Override
	public void deleteItemById(int itemId) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(itemId);
		
	}

	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		Item updatedItem = itemRepository.updateItem(item);
		return updatedItem;
	}








	
}
