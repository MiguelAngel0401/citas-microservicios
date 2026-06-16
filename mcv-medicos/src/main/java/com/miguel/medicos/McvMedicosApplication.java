package com.miguel.medicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.miguel.medicos", "com.miguel.commons"})

public class McvMedicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(McvMedicosApplication.class, args);
	}

}
