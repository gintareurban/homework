package com.ginurban.pd12.withInterfaceModified;

public class Newspaper extends Product implements CartItems {

	public Newspaper(String name, double price) {
		super(name, price);
	}

	private static final double NEWSPAPER_VAT = 0.09;

	@Override
	public double getVAT() {
		
		return NEWSPAPER_VAT;
	}
	
	
	
	
	
}
