package com.book.bookstore.service;

import com.book.bookstore.entity.Author;
import com.book.bookstore.repository.AuthorRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRep authorRep;

    public Author findById(Long id)
    {
        return authorRep.findById(id).orElse(null);
    }
}
