package com.example.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoRepository;
import com.example.demo.entities.Todo;
import com.example.demo.services.TodoService;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> getTodos() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public Todo getTodo(Long todoId) {
		// TODO Auto-generated method stub
		return todoRepository.findById(todoId).get();
	}

	@Override
	public Todo addTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepository.save(todo);
	}

	@Override
	public Todo updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepository.save(todo);
	}

	@Override
	public void deleteTodo(Long todoId) {
		// TODO Auto-generated method stub
		Todo todo=todoRepository.findById(todoId).get();
		todoRepository.delete(todo);
	}
}
