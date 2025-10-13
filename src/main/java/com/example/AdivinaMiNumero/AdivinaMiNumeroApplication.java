package com.example.AdivinaMiNumero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdivinaMiNumeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdivinaMiNumeroApplication.class, args);
	}
	/*
	CONSULTAS:
	GET  - http://localhost:8080/game/rules
	POST - http://localhost:8080/game/start?name=Raquel
	POST - http://localhost:8080/game/guess?number=4
	 */
}
