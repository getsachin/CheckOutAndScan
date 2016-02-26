package com.scanner.rest;
import static org.junit.Assert.*;

public class CheckoutSteps {
	Checkout checkout = new Checkout();
	
	
	public void thePriceOfAIsC(String name, int price, char catagory) throws Throwable {
		checkout.addItem(name, price,catagory);
	}
	
	
	public void iCheckout(String name, int count) throws Throwable {
		checkout.scanItems(name, count);
	}
	
	
	public void theTotalPriceShouldBeC(int sumTotal) throws Throwable {
		assertEquals(sumTotal, checkout.totalCart());
	}

}
