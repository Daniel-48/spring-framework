package com.dam.models;

public class InvoiceItems {

	private Product product;
	private Integer numberOfProducts;

	public InvoiceItems(Product product, Integer numberOfProducts) {
		this.product = product;
		this.numberOfProducts = numberOfProducts;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(Integer numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}

	public Float calculateTotalPrice() {
		return product.getPrice() * numberOfProducts;
	}

}