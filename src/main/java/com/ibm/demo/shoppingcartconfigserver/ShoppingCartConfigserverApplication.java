package com.ibm.demo.shoppingcartconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ShoppingCartConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartConfigserverApplication.class, args);
	}

}
