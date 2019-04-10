package sample.Repository;

import sample.Domain.Agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepositoryAgenda {

    private Map<Integer, Agenda> storage = new HashMap<>();

    /**
     *
     * @param add as per Map characteristic
     */
    public void add(Agenda b) {
        storage.put(b.getId(),b);
    }

    /**
     *
     * @param id
     * @return - Object from correspondent id
     */
    public Agenda findById(int id) {
        return storage.get(id);
    }

    /**
     *
     * @return - list with all events
     */
    public ArrayList<Agenda> showAll() {
        return new ArrayList<>(storage.values());
    }

    public Agenda existentDate(int id) {
        return storage.get(id);
    }
}