package com.example.rechnungsBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class RechnungsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RechnungsBackendApplication.class, args);
	}

}
