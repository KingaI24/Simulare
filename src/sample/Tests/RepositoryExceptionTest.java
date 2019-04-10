package sample.Tests;

import sample.Domain.DomainException;
import sample.Repository.RepositoryException;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryExceptionTest {
    private RepositoryException d = new RepositoryException("test");

    @org.junit.jupiter.api.Test
    void correctMessageShouldBeGiven() {
        assertEquals("test",d);
    }

}