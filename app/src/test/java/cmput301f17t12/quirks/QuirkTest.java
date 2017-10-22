package cmput301f17t12.quirks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class QuirkTest {


    // Test get All events
    @Test
    public void testGetEventList() {
        ArrayList<Event> initEvent = new ArrayList<Event>();
        Event event = new Event("test");
        initEvent.add(event);

        Quirk myQuirk = new Quirk("some_type", "some_title", 123, initEvent);
        ArrayList<Event> returnedEvents = myQuirk.getEventList();
        assertEquals(returnedEvents, initEvent);
    }

    // Test adding an Event
    @Test
    public void testAddEvent() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);

        ArrayList<Event> events = myQuirk.getEventList();
        Event event = new Event("some event");
        events.addEvent(event);
        assertTrue(events.hasEvent(event));
    }

    // Test get an Event
    @Test
    public void testGetEvent() {
        Quirk myQuirk = newQuirk("some_type", "some_title", 123);
        Event event = new Event("test");
        myQuirk.addEvent(event);
        Event returnedevent = myQuirk.getEvent(0);
        assertEquals(returnedevent.isEquals(event));
    }

    // Test remove an Event
    @Test
    public void testRemoveEvent() {
        Quirk myQuirk = newQuirk("some_type", "some_title", 123);
        Event event = new Event("test");
        myQuirk.addEvent(event);
        myQuirk.removeEvent(event);
        ArrayList<Event> returnedevents = myQuirk.getEventList();
        assertFalse(returnedevents.contains(event));
    }

    // Test title
    @Test
    public void testGetTitle() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        assertEquals("some_title", myQuirk.getTitle());
    }

    @Test
    public void testSetTitle() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        myQuirk.setTitle("new title");
        assertEquals("new title", myQuirk.getTitle());
    }

    // Test type
    @Test
    public void testGetType() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        assertEquals("some_type", myQuirk.getType());
    }

    @Test
    public void testSetTitle() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        myQuirk.setTitle("new type");
        assertEquals("new type", myQuirk.getTitle());
    }

    // Testing quirk reason
    @Test
    public void testGetQuirkReason() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123, "Feel better");
        assertEquals("Feel better", myQuirk.getReason());
    }

    @Test
    public void testSetQuirkReason() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        myQuirk.setReason("for the gains");
        String reason = myQuirk.getReason();
        assertEquals("for the gains", reason);
    }

    // Test start date
    @Test
    public void testGetDate() {
        Date now = new Date();
        Quirk myQuirk = new Quirk("some_type", "some_title", 123, now);
        assertEquals(now, myQuirk.getDate());
    }

    @Test
    public void testSetDate() {
        Date now = new Date();
        Quirk myQuirk = new Quirk("some_type", "some_title", 123, now);
        // Some date here
        Date newDate = new Date("YYYY-mm-dd");
        myQuirk.setDate(newDate);
        assertEquals(newDate, myQuirk.getDate());
    }

    // Testing quirk occurences
    @Test
    public void testGetOccDate() {
        ArrayList<Day> occurence = new ArrayList<Day>();
        occurence.add(Monday);
        occurence.add(Tuesday);
        Quirk myQuirk = new Quirk("some_type", "some_title", 123, occurence);
        ArrayList<Day> returnedOccurence = myQuirk.getOccDate();
        assertEquals(occurence, returnedOccurence);
    }

    @Test
    public void testSetOccDate() {
        ArrayList<Day> occurence = new ArrayList<Day>();
        occurence.add(Monday);
        occurence.add(Tuesday);
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        myQuirk.setOccDate(occurence);
        assertEquals(occurence, myQuirk.getOccDate());
    }

    // Test goal
    @Test
    public void testGetGoalValue() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        assertEquals(myQuirk.getGoalValue(), 123);
    }

    @Test
    public void testSetGoalValue() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        myQuirk.setGoalValue(170);
        assertEquals(myQuirk.getGoalValue(), 170);
    }

    // Test progressing quirk
    @Test
    public void testGetCurrValue() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        // Should have no progress new quirk, 123 is goal
        assertEquals(myQuirk.getCurrValue(), 0);
    }

    @Test
    public void testIncCurrValue() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        int previous = myQuirk.getCurrValue();
        myQuirk.incCurrValue();
        assertEquals(myQuirk.getCurrValue(), previous + 1);
    }

    @Test
    public void testresetCurrValue() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        myQuirk.incCurrValue();
        myQuirk.incCurrValue();
        myQuirk.resetCurrValue();
        assertEquals(myQuirk.getCurrValue(), 0);
    }

}

