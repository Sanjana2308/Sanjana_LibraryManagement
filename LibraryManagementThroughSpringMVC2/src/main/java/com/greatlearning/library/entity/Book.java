package com.greatlearning.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	
	@Id // to make id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremented value
	@Column(name="id")//to give a specific name of columns 
	private int id;
	
	@Column(name="name")
	private String name;
	@Column(name="category")
	private String category;
	@Column(name="author")
	private String author;
	
	//default constructor which is used by spring to save all the values through getter and setter 
	public Book() {
		
	}
	
	public Book( String name, String category, String author) {
		this.name = name;
		this.category = category;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
}
