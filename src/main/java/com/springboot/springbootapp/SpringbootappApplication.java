package com.springboot.springbootapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class SpringbootappApplication {

		public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);

	}



}
