package com.auction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auction.model.BidDetails;
import com.auction.repository.BidRepository;

@Service
public class BuyerServiceImpl implements BuyerService{
	
	@Autowired
	BidRepository bidRepository;

	public String saveBidDetails(BidDetails bidDetails) {
		
		bidDetails = bidRepository.save(bidDetails);
		return "Saved Succesfully";
	}
	
	public List<BidDetails> retrieveBids(String productId){
		
		List<BidDetails> bidDetails = bidRepository.findByProductId(productId);
		return bidDetails;
	}
	
	
	  public List<BidDetails> updateBidPice(String _id, String mail, Double bidAmount){
		  
		  List<BidDetails> bidDetails = bidRepository.updateBidPrice(_id, mail, bidAmount);
		  
		  return bidDetails;
	}
	 
	
}
