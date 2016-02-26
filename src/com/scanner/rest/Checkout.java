package com.scanner.rest;

import java.util.HashMap; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/addAndScan")
public class Checkout {

	
		HashMap<String, Item> items = new HashMap<String, Item>(); 

	 @Path("/addItem")
	 @GET
	 	public void addItem(String name, int price, char catagory) { 
	 		items.put(name, new Item(name, price, catagory)); 
	 	} 
	@Path("/scanItem")
	@GET
	 	public void scanItems(String name, int count) { 
	 		items.get(name).count = count; 
	 	} 
	@Path("/total") 
	@GET
	@Produces("application/xml")
	 	public int totalCart() { 
	 		int total = 0; 
	 		for (Item item : items.values()) { 
	 			total += item.price * item.count; 
	 		} 
	 		return total; 
	 	} 
	 } 


