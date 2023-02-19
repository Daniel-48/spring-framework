package com.dam.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

	@Value("${invoice.description}")
	private String description;
	@Autowired
	private Customer customer;
	@Autowired
	private List<InvoiceItems> items;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<InvoiceItems> getItems() {
		return items;
	}

	public void setItems(List<InvoiceItems> items) {
		this.items = items;
	}

}