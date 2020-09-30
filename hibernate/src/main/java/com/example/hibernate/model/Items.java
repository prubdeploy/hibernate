package com.example.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="items")
public class Items {
	
	@Id
	@Column(name="item_id")
	String itemID; 
	@Column(name="item_des")
	String itemDescription;
//	@OneToMany(mappedBy="orderItems")
//	Set<Orders> orders;
	
	
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	

}
