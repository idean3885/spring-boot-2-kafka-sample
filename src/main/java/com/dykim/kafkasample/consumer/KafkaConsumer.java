// Java Program to Illustrate Kafka Consumer

package com.dykim.kafkasample.consumer;

// Importing required classes
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

// Class
public class KafkaConsumer {

    @KafkaListener(topics = "ecoTopic",
        groupId = "group_id")

    // Method
    public void
    consume(String message)
    {
        // Print statement
        System.out.println("message = " + message);
    }
}
