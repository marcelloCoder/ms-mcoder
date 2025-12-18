package com.devsuperior.hrconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrconfigApplication.class, args);
	}

}
