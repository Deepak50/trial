package com.prj.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDeployTrial {
	public static void main(String[] args) {
		SpringApplication.run(AzureDeployTrial.class, args);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
}
