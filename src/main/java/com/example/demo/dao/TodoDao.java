package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Todo;

public interface TodoDao extends JpaRepository<Todo, Long>{

}
