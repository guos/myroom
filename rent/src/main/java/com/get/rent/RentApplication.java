package com.get.rent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentApplication {
private static final Logger LOGGER=LoggerFactory.getLogger(RentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RentApplication.class, args);
		LOGGER.info("==============The server is started ==========");
	}
}
