package com.miguel.citas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.miguel.citas", "com.miguel.commons"})
public class McvCitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(McvCitasApplication.class, args);
	}

}
