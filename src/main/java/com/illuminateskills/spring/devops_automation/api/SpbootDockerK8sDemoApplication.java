package com.illuminateskills.spring.devops_automation.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpbootDockerK8sDemoApplication {
	
	@GetMapping("/message")
	public String displayMessage() {
		
		return "Congratulations!!! You successfully deployed your application to Kubernetes!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpbootDockerK8sDemoApplication.class, args);
	}

}
