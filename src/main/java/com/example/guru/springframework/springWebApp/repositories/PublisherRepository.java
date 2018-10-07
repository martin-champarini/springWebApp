package com.example.guru.springframework.springWebApp.repositories;

import com.example.guru.springframework.springWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
