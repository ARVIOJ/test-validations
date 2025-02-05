package com.trainibit.test_validations.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface KafkaConsumerService {
    void readMessages(ConsumerRecord<String, String> message);
}
