package com.example.graphql.DTO;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookDTO implements Serializable {

    private UUID bookId;

    private String title;

    private UUID authorId;
}
