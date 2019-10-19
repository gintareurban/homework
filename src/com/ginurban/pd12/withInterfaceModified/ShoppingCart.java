package com.ginurban.pd12.withInterfaceModified;

import java.util.Arrays;

public class ShoppingCart {

	private CartItems[] items = new CartItems[0];
	
	
	
	
	@Override
	public String toString() {
		return "ShoppingCart [" + Arrays.toString(items) + "]";
	}


	public CartItems[] addItems(CartItems[] itemsToAdd) {
		
		for (int i = 0; i < itemsToAdd.length; i++) {
			
			items = addOneItem(itemsToAdd[i]);
			
		}
		
		return items;
	}
	
	
	private CartItems[] addOneItem(CartItems item) {
		CartItems[] newItems = new CartItems[items.length + 1];
		
		for(int i = 0; i < items.length; i++) {
			newItems[i] = items[i];
		}
		newItems[newItems.length-1] = item;
		items = newItems;
		return items;
	}
	
	public double getTotalEURexVAT() {
		double total = 0.0;
		for (CartItems item : items) {
			total += item.getPriceEUR();
		}
		return total;
	}
	
	public double getTotalEURincVAT() {
		double total = 0.0;
		for (CartItems item : items) {
			total += item.getPriceEURincVAT();
		}
		return total;
	}
	
	public double getTotalUSDexVAT() {
		double total = 0.0;
		for (CartItems item : items) {
			total += item.getPriceUSD();
		}
		return total;
	}
	
	public double getTotalUSDincVAT() {
		double total = 0.0;
		for (CartItems item : items) {
			total += item.getPriceUSDincVAT();
		}
		return total;
	}
	
	
	
}
