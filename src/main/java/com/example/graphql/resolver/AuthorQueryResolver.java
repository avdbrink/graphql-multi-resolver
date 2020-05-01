package com.example.graphql.resolver;

import java.util.UUID;

import com.example.graphql.DTO.AuthorDTO;
import com.example.graphql.service.AuthorService;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AuthorQueryResolver implements GraphQLQueryResolver {

    private final AuthorService authorService;

    public AuthorDTO author(UUID authorId) {
        return authorService.getAuthor(authorId);
    }

    public Iterable<AuthorDTO> findAllAuthors() {
        return authorService.getAuthors();
    }

}
