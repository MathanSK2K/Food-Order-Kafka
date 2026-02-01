package com.food.order.business.service;


import com.food.order.model.Item;
import org.springframework.stereotype.Service;

@Service
public interface KafkaService {

    String sendOrders(Item item);
}