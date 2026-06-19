package com.miguel.citas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.miguel.citas", "com.miguel.commons"})
@EnableFeignClients
public class McvCitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(McvCitasApplication.class, args);
	}

}
