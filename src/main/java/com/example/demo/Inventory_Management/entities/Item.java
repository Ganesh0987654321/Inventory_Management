package com.example.demo.Inventory_Management.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int itemId;
	
	private String itemName;
	
	private String itemDescription;
	
	private boolean itemStockStatus;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public boolean isItemStockStatus() {
		return itemStockStatus;
	}

	public void setItemStockStatus(boolean itemStockStatus) {
		this.itemStockStatus = itemStockStatus;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", itemStockStatus=" + itemStockStatus + "]";
	}
	
	
	
	
	

}
