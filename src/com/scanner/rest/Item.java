package com.scanner.rest;

public class Item {

		String name;
		int price = 0;
		int count = 0;
		
		public Item(String name, int price, char catagory) {
			this.name = name;
			this.price = price;
			this.count = 0;
		}

}
