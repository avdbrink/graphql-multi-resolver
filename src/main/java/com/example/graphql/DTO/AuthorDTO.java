package com.example.graphql.DTO;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthorDTO implements Serializable {

    private UUID authorId;

    private String Name;

}
