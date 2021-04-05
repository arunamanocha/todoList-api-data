package com.todolist.repository;

import org.springframework.data.repository.CrudRepository;

import com.todolist.entity.ToDoList;

public interface ToDoListRepository extends CrudRepository<ToDoList, String> {

}
