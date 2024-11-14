package com.example.first_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstConsumerApplication {

	public static void main(String[] args) {
		System.out.println("Starting FirstConsumerApplication");
		SpringApplication.run(FirstConsumerApplication.class, args);
	}

}
