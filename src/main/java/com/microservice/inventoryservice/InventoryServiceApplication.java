package com.microservice.inventoryservice;

import com.microservice.inventoryservice.model.Inventory;
import com.microservice.inventoryservice.repository.InventoryRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory item1 = new Inventory();
			item1.setSkuCode("iPhone_15");
			item1.setQuantity(100);

			Inventory item2 = new Inventory();
			item2.setSkuCode("iPhone_15_red");
			item2.setQuantity(0);

			inventoryRepository.save(item1);
			inventoryRepository.save(item2);
		};
	}
}
