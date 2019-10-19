package com.ginurban.pd12.withoutInterface;

public class Shop {

	public static void main(String[] args) {
		
		Item[] items = {new Item("Banana", 0.5),
				new Item("Milk", 0.9),
				new Item("Bread", 1.7),
				new Item("Beer", 1.5),
				new Medicine("Painkiller", 4.2),
				new Newspaper("LocalNews", 2.3),
				new Item("Water", 0.5)};
		
		System.out.println(ShoppingCart.findTotalEURexVAT(items));
		System.out.println(ShoppingCart.findTotalEURincVAT(items));
		System.out.println(ShoppingCart.findTotalUSDexVAT(items));
		System.out.println(ShoppingCart.findTotalUSDincVAT(items));
		
//		Item[] itemstest = {
//				new Medicine("Painkiller", 4.2)};
//		System.out.println(ShoppingCart.findTotalEURincVAT(itemstest));
		
		
	
		
		
		
		
		
		}

	}


