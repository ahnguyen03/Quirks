xr

public class EventList {

  // Test getEventList
  public void testGetList() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Drop drop1 = new drop("drop1", "this is drop1", "Common");

    Inventory myInventory = new Inventory();
    myInventory.addQuirk(drop);
    myInventory.addQuirk(drop);

    ArrayList<Drop> dropList = new ArrayList<Drop>();
    dropList.add(drop);
    dropList.add(drop1);

    assertEquals(myInventory, dropList);
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
    DEvent event = new Event("ate lettuce");
    EventList myEventList = new EventList();
    myEventList.addEvent(event);
    myEventList.deleteEvent(event);
    assertFalse(myEventList.getList().contains(event));
  }

}

