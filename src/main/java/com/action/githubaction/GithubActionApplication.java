package com.action.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GithubActionApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to First Project !!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);
	}


}
