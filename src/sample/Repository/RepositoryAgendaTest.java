package sample.Repository;

import org.junit.jupiter.api.Test;
import sample.Domain.Agenda;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryAgendaTest {

    private RepositoryAgenda repository;

    private Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
    private Agenda a2 = new Agenda(2,"Game1", "12.12.2018", 30, "12:12");
    private Agenda a3 = new Agenda(1,"Game2", "12.12.2018", 30, "12:12");

    @Test
    void getByIdShouldReturnCorrectEntity() {
        repository.add(a1);
        assertEquals(a1, repository.findById(1));
    }

    @Test
    void addCorrectly() {
        repository.add(a1);
        repository.add(a2);
        repository.add(a3);
        List ag = repository.showAll();
        assertEquals(2,ag.size());
    }

    @Test
    void updateCorrectly() {
        repository.add(a1);
        repository.add(a3);
        List ag = repository.showAll();
        assertEquals(1,ag.size());
    }


    @Test
    void showShouldShowAllEntities() {
        repository.add(a1);
        repository.add(a2);
        List<Agenda> ag = repository.showAll();

        assertEquals(2, ag.size());
        assertEquals(1, ag.get(0).getId());
        assertEquals(2, ag.get(1).getId());
    }


}