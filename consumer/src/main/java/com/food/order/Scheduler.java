package com.food.order;

import com.food.order.business.service.KafkaService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@ConditionalOnProperty(
        name = "orders.scheduler.process.enabled",
        havingValue = "true"
)
public class Scheduler {

    private final KafkaService kafkaService;

    public Scheduler(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @Scheduled(fixedDelay = 10000)
    public void processQueueAutomatically() {
        System.out.println("Processing Order queue");
        kafkaService.getMessage();
    }
}
