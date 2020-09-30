package com.example.hibernate.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="orders")
public class Orders {


		@Id
		@Column(name="order_id")
		int orderID; 
		@Column(name="order_amt")
		double orderAmount;
		@ManyToMany
		@JoinTable(name="order_items", 
		joinColumns= {@JoinColumn(name="order_id")},
		inverseJoinColumns= {@JoinColumn(name="item_id")})
		Set<Items> orderItems= new HashSet<>();
		
		public int getOrderID() {
			return orderID;
		}
		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}
		public Set<Items> getOrderItems() {
			return orderItems;
		}
		public void setOrderItems(Set<Items> orderItems) {
			this.orderItems = orderItems;
		}
		public double getOrderAmount() {
			return orderAmount;
		}
		public void setOrderAmount(double orderAmount) {
			this.orderAmount = orderAmount;
		}
		
		
}
