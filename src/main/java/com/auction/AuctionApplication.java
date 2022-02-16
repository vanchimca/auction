package com.auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class AuctionApplication{
	/*
	 * @Autowired private ProductRepository repository;
	 */

	public static void main(String[] args) {
		SpringApplication.run(AuctionApplication.class, args);
	}
	
	
	/*
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("test----"+repository.count());
	 * repository.findAll().forEach(item ->
	 * System.out.println(getItemDetails(item))); }
	 * 
	 * public String getItemDetails(ProductDetails item) {
	 * 
	 * System.out.println( "Item Name: " + item.get_id() + ", \nQuantity: " +
	 * item.getProductName() + ", \nItem Category: " + item.getPrice() );
	 * 
	 * return ""; }
	 */

}
