package com.demo.product_catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProductCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogServiceApplication.class, args);
	}

}
