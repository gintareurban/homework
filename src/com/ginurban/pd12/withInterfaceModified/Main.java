package com.ginurban.pd12.withInterfaceModified;

public class Main {

	public static void main(String[] args) {

		ShoppingCart cart1 = new ShoppingCart(); 

		CartItems[] items1 = { new Medicine("Aspirin", 3.0),
				new Newspaper("LRytas", 2.5),
				new Groceries("Milk", 1.2)
		};

		CartItems[] items2 = {new Groceries("Bread", 1.8)
		};

		cart1.addItems(items1);
		cart1.addItems(items2);


		System.out.println(cart1.toString());
		
		System.out.printf("Your shopping cart total in EUR ex VAT: %5.2f%n", cart1.getTotalEURexVAT());
		System.out.printf("Your shopping cart total in EUR inc VAT: %5.2f%n", cart1.getTotalEURincVAT());
		System.out.printf("Your shopping cart total in USD ex VAT: %5.2f%n", cart1.getTotalUSDexVAT());
		System.out.printf("Your shopping cart total in USD inc VAT: %5.2f%n", cart1.getTotalUSDincVAT());


	}

}
