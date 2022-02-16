package com.auction.service;

import java.util.List;
import java.util.Optional;

import com.auction.model.BidDetails;

public interface BuyerService {

	public String saveBidDetails(BidDetails bidDetails);
	public List<BidDetails> retrieveBids(String productId);
	public List<BidDetails> updateBidPice(String _id, String mail, Double bidPrice);
	
}
