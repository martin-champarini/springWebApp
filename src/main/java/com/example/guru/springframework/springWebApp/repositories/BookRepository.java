package com.example.guru.springframework.springWebApp.repositories;

import com.example.guru.springframework.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
