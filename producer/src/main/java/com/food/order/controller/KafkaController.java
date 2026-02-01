package com.food.order.controller;

import com.food.order.business.service.KafkaService;
import com.food.order.model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/add-order")
    public ResponseEntity<String> addOrder(@RequestBody Item item){
        String response=kafkaService.sendOrders(item);
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}