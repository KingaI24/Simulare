package sample.Tests;

import sample.Domain.DomainException;

import static org.junit.jupiter.api.Assertions.*;

class DomainExceptionTest {
    private DomainException d = new DomainException("test");

    @org.junit.jupiter.api.Test
    void correctMessageShouldBeGiven() {
        assertEquals("test",d);
    }
}
