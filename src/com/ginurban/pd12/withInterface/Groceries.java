package com.ginurban.pd12.withInterface;

public class Groceries extends Product implements CartItems {
	
	private static final double GROCERIES_VAT = 0.21;

	public Groceries(String name, double price) {
		super(name, price);
		
	}

	@Override
	public double getVAT() {
		
		return GROCERIES_VAT;
	}
	
	

}
