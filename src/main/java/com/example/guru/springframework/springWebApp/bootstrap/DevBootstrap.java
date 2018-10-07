package com.example.guru.springframework.springWebApp.bootstrap;

import com.example.guru.springframework.springWebApp.model.Author;
import com.example.guru.springframework.springWebApp.model.Book;
import com.example.guru.springframework.springWebApp.repositories.AuthorRepository;
import com.example.guru.springframework.springWebApp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    public void initData() {

        Book egy_safe = new Book("Energy Safe","1234","GreenPeace");
        Author mk_green = new Author("Mark","Green");

        egy_safe.getAuthors().add(mk_green);
        mk_green.getBooks().add(egy_safe);

        authorRepository.save(mk_green);
        bookRepository.save(egy_safe);


        Book da_vinci_code_ = new Book("The Da Vinci Code ","56234"," LittleLadysBooks");
        Author dan_brown = new Author("Dan","Brown");

        da_vinci_code_.getAuthors().add(dan_brown);
        dan_brown.getBooks().add(da_vinci_code_);

        authorRepository.save(dan_brown);
        bookRepository.save(da_vinci_code_);

    }
}
