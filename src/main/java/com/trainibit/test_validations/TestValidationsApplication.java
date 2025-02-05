package com.trainibit.test_validations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class TestValidationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestValidationsApplication.class, args);
		log.info("Escuchando mensajes del tópico emails_sent");
	}

}
