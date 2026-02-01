package com.food.order;

import com.food.order.business.service.KafkaService;
import com.food.order.model.Item;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@EnableScheduling
@ConditionalOnProperty(
        name = "orders.scheduler.send.enabled",
        havingValue = "true"
)
public class Scheduler {

    private final KafkaService kafkaService;

    public Scheduler(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @Scheduled(fixedDelay = 10000)
    public void sendQueueAutomatically() {
        Item item = new Item(null,"Mathan",
                "Mutton Briyani","Non Veg",1,"Extra piece");
        kafkaService.sendOrders(item);
    }
}
