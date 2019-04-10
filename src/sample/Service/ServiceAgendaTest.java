package sample.Service;

import sample.Repository.RepositoryAgenda;

import static org.junit.jupiter.api.Assertions.*;

class ServiceAgendaTest {
    RepositoryAgenda repository = new RepositoryAgenda();
    ServiceAgenda service = new ServiceAgenda(repository);

}