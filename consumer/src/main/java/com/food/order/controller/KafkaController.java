package com.food.order.controller;

import com.food.order.business.service.KafkaService;

import com.food.order.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping ("/get-order")
    public ResponseEntity<String> getOrder(){
        kafkaService.getMessage();
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}