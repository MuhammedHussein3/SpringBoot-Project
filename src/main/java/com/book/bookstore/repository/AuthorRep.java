package com.book.bookstore.repository;

import com.book.bookstore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRep extends JpaRepository<Author,Long> {
}
