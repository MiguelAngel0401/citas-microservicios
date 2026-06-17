package com.miguel.pacientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.miguel.pacientes", "com.miguel.commons"})
public class McvPacientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(McvPacientesApplication.class, args);
	}

}
