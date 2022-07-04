package com.example.docker.controller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.dao.BookRepository;
import com.example.docker.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return repository.save(book);
	}
	
	@GetMapping
	public List<Book> getBooks(){
		return repository.findAll();

	}
}
