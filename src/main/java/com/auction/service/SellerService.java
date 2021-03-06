package com.auction.service;

import java.util.List;
import java.util.Optional;

import com.auction.model.ProductDetails;

public interface SellerService {

	public String saveProductDetails(ProductDetails productDetails);
	public Optional<ProductDetails> retrieveProductDetails(String productId);
	public String deleteProduct(String productId);
	public List<ProductDetails> retrieveAllProducts(); 
	
}
