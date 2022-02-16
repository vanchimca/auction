package com.auction.repository;

import java.util.List;

import com.auction.model.BidDetails;

public interface BidRepositoryCustom {

	List<BidDetails> updateBidPrice(String _id, String mail, Double bidPrice);
}
