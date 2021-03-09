package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Todo;

public interface TodoService {

	public List<Todo> getTodos();
	
	public Todo getTodo(Long todoId);
	
	public Todo addTodo(Todo todo);
	
	public Todo updateTodo(Todo todo);
	
	public void deleteTodo(Long todoId);
}
