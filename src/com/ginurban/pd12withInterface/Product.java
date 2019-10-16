package com.ginurban.pd12withInterface;

public abstract class Product implements CartItems {

	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}



	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPriceincVAT() {
		return this.price *(1 + this.getVAT());
	}
	
	public double getPriceUSD() {
		return price * 1.1;
	}
	
	public double getPriceUSDincVAT() {
		return this.getPriceincVAT() * 1.1;
	}
	
	
	
}
