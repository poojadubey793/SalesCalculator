package com.sales.SalesCalculator;

import com.sales.SalesCalculator.services.SalesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalesCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesCalculatorApplication.class, args);
	}

	@Bean
	public SalesService salesService() {
		return new SalesService();
	}

}
