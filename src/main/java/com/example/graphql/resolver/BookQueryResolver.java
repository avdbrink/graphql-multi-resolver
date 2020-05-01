package com.example.graphql.resolver;

import java.util.UUID;

import com.example.graphql.DTO.BookDTO;
import com.example.graphql.service.BookService;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BookQueryResolver implements GraphQLQueryResolver {

    private final BookService bookService;

    public BookDTO book(UUID bookId) {
        return bookService.getBook(bookId);
    }

    public Iterable<BookDTO> findAllBooks() {
        return bookService.getBooks();
    }
}
