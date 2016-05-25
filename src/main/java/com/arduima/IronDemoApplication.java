package com.arduima;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IronDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IronDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Iron.io");
	}
}
