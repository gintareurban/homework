package com.ginurban.pd12.withoutInterface;

public class ShoppingCart {

	
	public static double findTotalEURexVAT(Item[] items) {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPriceEURexVAT();
		}
		
		return total;
	}
	
	public static double findTotalEURincVAT(Item[] items) {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPriceEURincVAT();
		}
		
		return total;
	}
	
	public static double findTotalUSDexVAT(Item[] items) {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPriceUSDexVAT();
		}
		
		return total;
	}
	
	public static double findTotalUSDincVAT(Item[] items) {
		double total = 0.0;
		for (Item item : items) {
			total += item.getPriceUSDincVAT();
		}
		
		return total;
	}
	
	
}
