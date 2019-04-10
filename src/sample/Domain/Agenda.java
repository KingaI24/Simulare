package sample.Domain;

public class Agenda {

    private int id, duration;
    private String name, date, debut;

    public Agenda(int id, String name, String date, int duration, String debut) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.debut = debut;
    }

    public int getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDebut() {
        return debut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", duration=" + duration +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", debut='" + debut + '\'' +
                '}';
    }
}