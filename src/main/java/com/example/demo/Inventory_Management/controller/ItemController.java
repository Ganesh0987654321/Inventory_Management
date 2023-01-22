package com.example.demo.Inventory_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Inventory_Management.entities.Item;
import com.example.demo.Inventory_Management.service.ItemServiceI;

@RestController
public class ItemController {
	
	@Autowired
	private ItemServiceI itemServiceI;
	
	//Method for save Item
	
	@PostMapping("/saveItem")
	public ResponseEntity<Item> saveItem(@RequestBody Item item)
	{
		Item saveItem = itemServiceI.saveItem(item);
		return new ResponseEntity<Item>(saveItem,HttpStatus.CREATED);
		
	}
	
	
	//Method for get all item
	
	@GetMapping("/getAllItem")
	public ResponseEntity<List<Item>> getAllItem()
	{
		List<Item> allItem = itemServiceI.getAllItem();
		return new ResponseEntity<List<Item>>(allItem,HttpStatus.OK);
		
	}
	
	//Method for delete/remove item from stock
	
	@DeleteMapping("/deleteItemById/{itemId}")
	public boolean deleteItemById(@PathVariable int itemId)
	{
		itemServiceI.deleteItemById(itemId);
		return false;
		
	}
	
	//Method for updating the item
	@PutMapping("/updateItem")
	public ResponseEntity<Item> updateItem(@RequestBody Item item)
	{
		Item updateItem = itemServiceI.updateItem(item);
		return new ResponseEntity<Item>(updateItem,HttpStatus.OK);
		
	}
	

}
