package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
