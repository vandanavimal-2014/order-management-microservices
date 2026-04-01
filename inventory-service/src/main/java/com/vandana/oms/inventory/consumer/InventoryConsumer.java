package com.vandana.oms.inventory.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryConsumer {

    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void consume(String message) {
        System.out.println("Received Order Message: " + message);
        System.out.println("Inside inventory-consumer method");
        // reduce stock logic
    }
}
