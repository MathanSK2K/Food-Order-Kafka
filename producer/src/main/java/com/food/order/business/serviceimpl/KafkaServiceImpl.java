package com.food.order.business.serviceimpl;

import com.food.order.business.service.KafkaService;
import com.food.order.model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class KafkaServiceImpl implements KafkaService {

    @Autowired
    private KafkaTemplate<String, Item> kafkaTemplate;

    @Override
    public String sendOrders(Item item) {
        item.setOrderId(UUID.randomUUID());
        kafkaTemplate.send("food-orders","order",item);
        System.out.println(item.toString());
        return "Order sent to Kafka Server";
    }
}