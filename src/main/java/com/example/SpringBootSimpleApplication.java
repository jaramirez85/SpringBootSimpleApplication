package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);
		app.setBanner((environment, aClass, out) -> {
            out.print("\n\n\tThis is my own banner!\n\n".toUpperCase());
        });
		app.run();
	}
}
