package com.foodapp.order.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.order.entity.Order;

@Repository
public interface OrderDao extends MongoRepository<Order,Integer> {

	

	

	

	
 
}


