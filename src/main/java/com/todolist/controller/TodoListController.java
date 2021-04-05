package com.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entity.ToDoList;
import com.todolist.service.ToDoListService;

@RestController
public class TodoListController {
	@Autowired
	ToDoListService toDoListService;
	
	@RequestMapping("/todolist")
	public List<ToDoList> getAllToDoList() {
		return toDoListService.getAllToDoList();
	 }
	
	@RequestMapping("/todolist/{id}") // informs spring that its a variable portion ({id})
	public ToDoList getToDoList(@PathVariable String id) {  
		return toDoListService.getToDoList(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/todolist")
	public void addToDoList(@RequestBody ToDoList toDoList) {
		toDoListService.addToDoList(toDoList);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/todolist/{id}")
	public void updateToDoList(@RequestBody ToDoList toDoList, @PathVariable String id) { 
		toDoListService.updateToDoList(id, toDoList);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/todolist/{id}")
	public void deleteToDoList( @PathVariable String id) { 
		toDoListService.deleteToDoList(id);
	}
}
