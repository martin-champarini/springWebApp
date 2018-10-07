package com.example.guru.springframework.springWebApp.repositories;

import com.example.guru.springframework.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
