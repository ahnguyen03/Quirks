package cmput301f17t12.quirks;

import android.net.Uri;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class QuirkTest {
//    private Quirk quirk = new Quirk (new ArrayList<Event>(), "title", "type", "reason",
//            new Date(), new ArrayList<Day>(), 1f, 2f);
//    private ArrayList<Event> events = new ArrayList<Event>();
//    private Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));

    // Test get All events
    @Test
    public void testGetEventList() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        EventList returnedEvents = myQuirk.getEventList();
        assertEquals(returnedEvents, events);
    }

    // Test adding an Event
    @Test
    public void testAddEvent() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

//        ArrayList<Event> events = myQuirk.getEventList();
        Event event2 = new Event(quirk, "other event", null, new Date(), new Geolocation(3,4));
        events.addEvent(event2);
        assertTrue(events.hasEvent(event2));
    }

    // Test get an Event
    @Test
    public void testGetEvent() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        Event event2 = new Event(quirk, "other event", null, new Date(), new Geolocation(3,4));
        myQuirk.addEvent(event2);
        Event returnedEvent = myQuirk.getEvent(0);
        assertTrue(returnedEvent.isEquals(event2));
    }

    // Test remove an Event
    @Test
    public void testRemoveEvent() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        Event event2 = new Event(quirk, "other event", null, new Date(), new Geolocation(3,4));
        myQuirk.addEvent(event2);
        myQuirk.removeEvent(event2);
        EventList returnedEvents = myQuirk.getEventList();
        assertFalse(returnedEvents.hasEvent(event2));
    }

    // Test title
    @Test
    public void testGetTitle() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        assertEquals("title", myQuirk.getTitle());
    }

    @Test
    public void testSetTitle() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        myQuirk.setTitle("new title");
        assertEquals("new title", myQuirk.getTitle());
    }

    // Test type
    @Test
    public void testGetType() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        assertEquals("type", myQuirk.getType());
    }

    @Test
    public void testSetType() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        myQuirk.setType("new type");
        assertEquals("new type", myQuirk.getTitle());
    }

    // Testing quirk reason
    @Test
    public void testGetQuirkReason() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        assertEquals("reason", myQuirk.getReason());
    }

    @Test
    public void testSetQuirkReason() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        myQuirk.setReason("for the gains");
        String reason = myQuirk.getReason();
        assertEquals("for the gains", reason);
    }

    // Test start date
    @Test
    public void testGetDate() {
        Date now = new Date();
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                now, new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", now, new ArrayList<Day>(), 0f, 123f);
        assertEquals(now, myQuirk.getStartDate());
    }

    @Test
    public void testSetDate() {
        Date now = new Date();
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", now, new ArrayList<Day>(), 0f, 123f);
        // Some date here
        Date newDate = new Date();
        myQuirk.setStartDate(newDate);
        assertEquals(newDate, myQuirk.getStartDate());
    }

    // Testing quirk occurences
    @Test
    public void testGetOccDate() {
        ArrayList<Day> occurence = new ArrayList<Day>();
        occurence.add(Day.MONDAY);
        occurence.add(Day.TUESDAY);


        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);

        ArrayList<Day> returnedOccurence = myQuirk.getOccDate();
        assertEquals(occurence, returnedOccurence);
    }

    @Test
    public void testSetOccDate() {
        ArrayList<Day> occurence = new ArrayList<Day>();
        occurence.add(Day.MONDAY);
        occurence.add(Day.TUESDAY);

        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);


        myQuirk.setOccDate(occurence);
        assertEquals(occurence, myQuirk.getOccDate());
    }

    // Test goal
    @Test
    public void testGetGoalValue() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        assertEquals(myQuirk.getGoalValue(), 123f);
    }

    @Test
    public void testSetGoalValue() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);

        myQuirk.setGoalValue(170f);
        assertEquals(myQuirk.getGoalValue(), 170f);
    }

    // Test progressing quirk
    @Test
    public void testGetCurrValue() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);

        // Should have no progress new quirk, 123 is goal
        assertEquals(myQuirk.getCurrValue(), 0f);
    }

    @Test
    public void testIncCurrValue() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        float previous = myQuirk.getCurrValue();
        myQuirk.incCurrValue();
        assertEquals(myQuirk.getCurrValue(), previous + 1f);
    }

    @Test
    public void testresetCurrValue() {
        Quirk quirk = new Quirk (new EventList(), "title", "type", "reason",
                new Date(), new ArrayList<Day>(), 1f, 2f);
        EventList events = new EventList();
        Event event = new Event(quirk, "comment", null, new Date(), new Geolocation(1,1));
        events.addEvent(event);

        Quirk myQuirk = new Quirk(events, "title", "type", "reason", new Date(), new ArrayList<Day>(), 0f, 123f);
        myQuirk.incCurrValue();
        myQuirk.incCurrValue();
        myQuirk.resetCurrValue();
        assertEquals(myQuirk.getCurrValue(), 0);
    }

}

