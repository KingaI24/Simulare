package sample.Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sample.Domain.Agenda;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {


    @Test
    void getShouldReturnCorrectId() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
        assertEquals(1, a1.getId(), String.format("Returned %d, expected=%d", a1.getId(),1));
    }

    @Test
    void getShouldReturnCorrectName() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
        assertEquals("Game1", a1.getName(), String.format("Returned %s, expected=%s", a1.getName(),"Game1"));
    }

    @Test
    void getShouldReturnCorrectDate() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
        assertEquals("12.12.2018", a1.getName(), String.format("Returned %s, expected=%s", a1.getName(),"12.12.2018"));
    }

    @Test
    void getShouldReturnCorrectDuration() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
        assertEquals(30, a1.getName(), String.format("Returned %d, expected=%d", a1.getName(),30));
    }

    @Test
    void getShouldReturnCorrectHour() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
        assertEquals("12:12", a1.getName(), String.format("Returned %s, expected=%s", a1.getName(),"12:12"));
    }
    @Test
    void toStringShouldReturnALongEnoughString() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");
        assertTrue(a1.toString().length() > 10);
    }

    @org.junit.jupiter.api.Test
    void settersShouldSetFieldsCorrectly() {
        Agenda a1 = new Agenda(1,"Game1", "12.12.2018", 30, "12:12");

        a1.setId(1);
        a1.setName("test");
        a1.setDate("test");
        a1.setDuration(20);
        a1.setDebut("12:13");

        assertEquals(1, a1.getId());
        assertEquals("test", a1.getName());
        assertEquals("test", a1.getDate());
        assertEquals(20, a1.getDuration());
        assertEquals("12:13",a1.getDebut());

    }

    @org.junit.jupiter.api.Test
    void constructorShouldSetAllFieldsCorrectly() {
        Agenda a1 = new Agenda(1,"test", "test", 20, "12:13");
        assertEquals(1, a1.getId());
        assertEquals("test", a1.getName());
        assertEquals("test", a1.getDate());
        assertEquals(20, a1.getDuration());
        assertEquals("12:13",a1.getDebut());
    }

}