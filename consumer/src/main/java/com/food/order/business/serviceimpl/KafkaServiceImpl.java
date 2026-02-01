package com.food.order.business.serviceimpl;

import com.food.order.business.service.KafkaService;
import com.food.order.model.Item;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Slf4j
@Data
@Service
public class KafkaServiceImpl implements KafkaService {

    private final Queue<String> messages = new ConcurrentLinkedQueue<>();

    @KafkaListener(topics = "food-orders",groupId = "orders")
    public void getOrders(Item item) {
        messages.add(item.toString() + " Order received");
    }

    public void getMessage() {
        String message;
        while (( message = messages.poll()) != null) {
            log.info(message);
        }
        return ;
    }

}