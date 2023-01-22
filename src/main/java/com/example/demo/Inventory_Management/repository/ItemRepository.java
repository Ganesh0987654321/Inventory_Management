package com.example.demo.Inventory_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Inventory_Management.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	public Item updateItem(Item item);

}
