package com.example.graphql.service;

import java.util.List;
import java.util.UUID;

import com.example.graphql.DTO.AuthorDTO;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    public static final AuthorDTO AUTHOR = new AuthorDTO(UUID.randomUUID(), "Author name");

    public AuthorDTO getAuthor(UUID authorId) {
        return AUTHOR;
    }

    public List<AuthorDTO> getAuthors() {
        return List.of(AUTHOR);
    }
}
