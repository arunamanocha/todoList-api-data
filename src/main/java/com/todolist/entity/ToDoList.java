package com.todolist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDoList {
	
	@Id // to make this primary key
	private String id;
	private String item;
	private String description;
	private String status;
	
	public ToDoList() {
		super();
	}
	
	public ToDoList(String id, String item, String description, String status) {
		super();
		this.id = id;
		this.item = item;
		this.description = description;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
