package com.cgi.fic.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
		System.out.println("Hello world");
	}

}
