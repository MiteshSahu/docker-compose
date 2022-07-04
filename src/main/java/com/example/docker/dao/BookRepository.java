package com.example.docker.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.docker.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
