package sample.Service;

import sample.Domain.Agenda;
import sample.Repository.RepositoryAgenda;

import java.util.ArrayList;
import java.util.List;

public class ServiceAgenda {

    private RepositoryAgenda repository;

    /**
     * @param repository
     */
    public ServiceAgenda(RepositoryAgenda repository) {
        this.repository = repository;
    }

    /**
     * @param id
     * @param name
     * @param date
     * @param duration
     * @param debut    adding based on unique ID and date-hour
     */
    public void addEvent(int id, String name, String date, int duration, String debut) {
        List<Agenda> fullAgenda = repository.showAll();
        for (Agenda a : fullAgenda) {
            if (a.getId() == id) {
                throw new ServiceException("ID already used");
            }

            if ((a.getDate() == date) && (a.getDebut() == debut)) {
                throw new ServiceException("booked date");
            }
        }

        Agenda a = new Agenda(id, name, date, duration, debut);
        repository.add(a);
    }

    /**
     * @return list with all events
     */

    public List<Agenda> showAll() {
        return repository.showAll();
    }

    /**
     * @param d
     * @return max duration verifying existence of date
     * style of date specified in JavaFX (DD.MM.YYYY)
     */

    public Integer maxLengthEvent(String d) {
        List<Integer> durationPerDay = new ArrayList<>();
        for (Agenda b : repository.showAll()) {
            if (b.getDate().equals(d)) {
                durationPerDay.add(b.getDuration());
            }
        }
        if (durationPerDay.isEmpty())
            throw new ServiceException("no events on selected day");
        Integer maxValue = 0;
        for (Integer a : durationPerDay) {
            if (a > maxValue)
                maxValue = a;
        }

        return maxValue;
    }
}