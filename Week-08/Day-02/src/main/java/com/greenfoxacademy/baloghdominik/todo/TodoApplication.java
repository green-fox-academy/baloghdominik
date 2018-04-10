package com.greenfoxacademy.baloghdominik.todo;

import com.greenfoxacademy.baloghdominik.todo.model.Todo;
import com.greenfoxacademy.baloghdominik.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Valami1"));
		todoRepository.save(new Todo("Valami2"));
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
