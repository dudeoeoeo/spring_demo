package com.docker_exam.backend_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BackendSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendSpringApplication.class, args);
	}

	@GetMapping("/")
	public String name() {
		return "hello world";
	}

	@GetMapping("/hel")
	public String doc() {
		return "docker hello";
	}
}
