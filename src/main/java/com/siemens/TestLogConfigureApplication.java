package com.siemens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class TestLogConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestLogConfigureApplication.class, args);
	}
}
