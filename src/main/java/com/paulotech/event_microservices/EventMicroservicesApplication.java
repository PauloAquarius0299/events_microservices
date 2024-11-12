package com.paulotech.event_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EventMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventMicroservicesApplication.class, args);
	}

}
