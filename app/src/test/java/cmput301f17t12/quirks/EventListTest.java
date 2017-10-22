package cmput301f17t12.quirks;


import org.junit.Test;
import static org.junit.Assert.*;

public class EventListTest {

    // Test getEventList
    @Test
    public void testGetList() {
        Event event = new Event("ate lettuce");
        EventList myEventList = new EventList();
        myEventList.addEvent(event);

        ArrayList<Event> eventList = new ArrayList<eventList>();
        eventList.add(event);

        assertEquals(myEventList, eventList);
    }

    // Test adding Event to EventList
    @Test
    public void testAddEvent() {
        Event event = new Event("ate lettuce");
        EventList myEventList = new EventList();
        myEventList.addEvent(event);
        assertTrue(myEventList.getList().contains(event));

    }

    // Test EventList has Event
    @Test
    public void testHasEvent() {
        Event event = new Event("ate lettuce");
        EventList myEventList = new EventList();
        myEventList.addEvent(event);
        assertTrue(myEventList.hasEvent(event));
    }

    // Test getting Event from EventList
    @Test
    public void testGetEvent() {
        Event event = new Event("ate lettuce");
        EventList myEventList = new EventList();
        myEventList.addEvent(event);
        assertEquals(myEventList.getEvent(0), event);
    }

    // Test to deleting Event from Eventlist
    @Test
    public void testDeleteEvent() {
        Event event = new Event("ate lettuce");
        EventList myEventList = new EventList();
        myEventList.addEvent(event);
        myEventList.deleteEvent(event);
        assertFalse(myEventList.getList().contains(event));
    }

}


