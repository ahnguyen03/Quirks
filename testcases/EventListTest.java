
public class EventList {

  // Test getEventList
  public void testGetList() {
    Event event = new Event("ate lettuce");
    EventList myEventList = new EventList();
    myEventList.addEvent(event);

    ArrayList<Event> eventList = new ArrayList<eventList>();
    eventList.add(event);

    assertEquals(myEventList, eventList);
  }

  // Test adding Event to EventList
  public void testAddEvent() {
    Event event = new Event("ate lettuce");
    EventList myEventList = new EventList();
    myEventList.addEvent(event);
    assertTrue(myEventList.getList().contains(event));

  }

  // Test EventList has Event

  public void testHasEvent() {
    Event event = new Event("ate lettuce");
    EventList myEventList = new EventList();
    myEventList.addEvent(event);
    assertTrue(myEventList.hasEvent(event));
  }

  // Test getting Event from EventList
  public void testGetEvent() {
    Event event = new Event("ate lettuce");
    EventList myEventList = new EventList();
    myEventList.addEvent(event);
    assertEquals(myEventList.getEvent(0), event);
  }

  // Test to deleting Event from Eventlist
  public void testDeleteEvent() {
    Event event = new Event("ate lettuce");
    EventList myEventList = new EventList();
    myEventList.addEvent(event);
    myEventList.deleteEvent(event);
    assertFalse(myEventList.getList().contains(event));
  }

}

