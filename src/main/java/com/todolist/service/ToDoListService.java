package com.todolist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entity.ToDoList;
import com.todolist.repository.ToDoListRepository;

@Service
public class ToDoListService {

	@Autowired
	ToDoListRepository toDoListRepository;
	public List<ToDoList> getAllToDoList() {
		List<ToDoList>  list = new ArrayList<>();
		
		toDoListRepository.findAll()
		.forEach(list::add);
		return list;
	}
	
	public ToDoList getToDoList(String id) {
		if (toDoListRepository.existsById(id))
			return toDoListRepository.findById(id).get();
		
		return new ToDoList();
	}

	public void addToDoList(ToDoList list) {
		toDoListRepository.save(list);
	}

	public void updateToDoList(String id, ToDoList list) {
		toDoListRepository.save(list);
	}

	public void deleteToDoList(String id) {
		toDoListRepository.deleteById(id);
		
	}
}
