package com.express.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer { // one side

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;

	private String customerName;

	private String mobileNo;

	@OneToMany(mappedBy = "customer",cascade = CascadeType.PERSIST)
	private List<Order> orders;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	//Basically used for associating i,e FK should be set 
	public void addOrder(Order order) {
		
		if(orders == null) {
			
			orders = new ArrayList<Order>();
		}
		
		order.setCustomer(this);
		orders.add(order);
	}

	
}
