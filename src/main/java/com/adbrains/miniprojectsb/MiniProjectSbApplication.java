package com.adbrains.miniprojectsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MiniProjectSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectSbApplication.class, args);
	}

}
