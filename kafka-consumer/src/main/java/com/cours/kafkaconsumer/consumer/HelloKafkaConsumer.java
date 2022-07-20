package com.cours.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloKafkaConsumer {
	
	@KafkaListener(topics="t_hello")
	private void consumer(String message) {
		System.out.println(message);
	}

}
