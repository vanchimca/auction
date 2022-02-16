package com.auction.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auction.model.ProductDetails;

public interface ProductRepository extends MongoRepository<ProductDetails, String> {

}
