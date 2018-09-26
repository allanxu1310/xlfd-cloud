package com.xlfd.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DockerDemoApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Docker World";
	}
}
