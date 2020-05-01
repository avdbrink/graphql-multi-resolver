package com.example.graphql.resolver;

import static graphql.Assert.assertNotNull;

import java.io.IOException;

import com.example.graphql.service.AuthorService;
import com.example.graphql.service.BookService;
import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@GraphQLTest
@ContextConfiguration(classes = {BookQueryResolver.class})
public class BookQueryResolverTest {

    @Autowired
    private GraphQLTestTemplate graphQLTestTemplate;

    @MockBean
    private BookService bookService;

    // When leaving out this AuthorService mock I get an error:
    // No qualifying bean of type 'com.example.graphql.service.AuthorService' available: expected at least 1 bean which qualifies as autowire candidate.
//    @MockBean
//    private AuthorService authorService;

    @Test
    public void testFindAllBooks() throws IOException {
        GraphQLResponse response = graphQLTestTemplate.postForResource("graphql/findAllBooks.graphql");
        assertNotNull(response);
    }
}
