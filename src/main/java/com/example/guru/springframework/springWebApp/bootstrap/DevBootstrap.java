package com.example.guru.springframework.springWebApp.bootstrap;

import com.example.guru.springframework.springWebApp.model.Author;
import com.example.guru.springframework.springWebApp.model.Book;
import com.example.guru.springframework.springWebApp.model.Publisher;
import com.example.guru.springframework.springWebApp.repositories.AuthorRepository;
import com.example.guru.springframework.springWebApp.repositories.BookRepository;
import com.example.guru.springframework.springWebApp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    public void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);


        Book egy_safe = new Book("Energy Safe","1234",publisher);
        Author mk_green = new Author("Mark","Green");

        egy_safe.getAuthors().add(mk_green);
        mk_green.getBooks().add(egy_safe);

        authorRepository.save(mk_green);
        bookRepository.save(egy_safe);


        Book da_vinci_code_ = new Book("The Da Vinci Code ","56234",publisher);
        Author dan_brown = new Author("Dan","Brown");

        da_vinci_code_.getAuthors().add(dan_brown);
        dan_brown.getBooks().add(da_vinci_code_);

        authorRepository.save(dan_brown);
        bookRepository.save(da_vinci_code_);

    }
}
