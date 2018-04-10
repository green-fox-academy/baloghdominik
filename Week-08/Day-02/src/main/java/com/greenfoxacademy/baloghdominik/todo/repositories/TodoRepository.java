package com.greenfoxacademy.baloghdominik.todo.repositories;

import com.greenfoxacademy.baloghdominik.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
