package sample.Tests;

import sample.Repository.RepositoryException;
import sample.Service.ServiceException;

import static org.junit.jupiter.api.Assertions.*;

class ServiceExceptionTest {
    private ServiceException d = new ServiceException("test");

    @org.junit.jupiter.api.Test
    void correctMessageShouldBeGiven() {
        assertEquals("test",d);
    }

}