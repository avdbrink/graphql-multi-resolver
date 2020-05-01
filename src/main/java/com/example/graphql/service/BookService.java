package com.example.graphql.service;

import java.util.List;
import java.util.UUID;

import com.example.graphql.DTO.BookDTO;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public static final BookDTO BOOK = new BookDTO(UUID.randomUUID(), "Title", UUID.randomUUID());

    public BookDTO getBook(UUID bookId) {
        return BOOK;
    }

    public List<BookDTO> getBooks() {
        return List.of(BOOK);
    }
}
