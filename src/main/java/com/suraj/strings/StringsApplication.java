package com.suraj.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping("/")
	public String strings() {
		return "Hello Client, How are you doing!";
	}
	@RequestMapping("/random")
	public String strings2() {
		return "Spring Boot is great! so easy to just respond with strings!";
	}
	
}
