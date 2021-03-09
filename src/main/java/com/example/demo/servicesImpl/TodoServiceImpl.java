package com.example.demo.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoDao;
import com.example.demo.entities.Todo;
import com.example.demo.services.TodoService;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoDao todoDao;
	
	@Override
	public List<Todo> getTodos() {
		// TODO Auto-generated method stub
		return todoDao.findAll();
	}

	@Override
	public Todo getTodo(Long todoId) {
		// TODO Auto-generated method stub
		return todoDao.findById(todoId).get();
	}

	@Override
	public Todo addTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoDao.save(todo);
	}

	@Override
	public Todo updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoDao.save(todo);
	}

	@Override
	public void deleteTodo(Long todoId) {
		// TODO Auto-generated method stub
		Todo todo=todoDao.findById(todoId).get();
		todoDao.delete(todo);
	}
}
