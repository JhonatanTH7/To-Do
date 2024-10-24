package com.ToDoProject.ToDo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableJpaAuditing
public class ToDoApplication {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dotenv dotenv = Dotenv.load();
		SpringApplication.run(ToDoApplication.class, args);
	}

}
