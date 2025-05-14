package com.isett.projectexam.repository;

import com.isett.projectexam.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}

