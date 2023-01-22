package com.example.demo.Inventory_Management.service;

import java.util.List;

import com.example.demo.Inventory_Management.entities.Item;

public interface ItemServiceI {
	
	public Item saveItem(Item item);
	
	public List<Item> getAllItem();
	
	public void deleteItemById(int itemId);
	
	public Item updateItem(Item item);
	
 
}
