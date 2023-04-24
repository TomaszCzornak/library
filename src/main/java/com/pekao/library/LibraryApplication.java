package com.pekao.library;

import com.pekao.library.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final ElectronicJournalRepository electronicJournalRepository;

    public LibraryApplication(BookRepository bookRepository, AuthorRepository authorRepository, CommentRepository commentRepository, UserRepository userRepository, ElectronicJournalRepository electronicJournalRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.electronicJournalRepository = electronicJournalRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }


    @Override
    public void run(String... args) {

        }
    }

