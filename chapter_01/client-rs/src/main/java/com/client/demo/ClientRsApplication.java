package com.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRsApplication.class, args);
	}

}
