public class QuirkTest {

  // Testing quirk list
  public void testAddQuirk() {
    ArrayList<Quirks> list = new ArrayList<Quirks>();
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    list.add(myQuirk);
    assertTrue(list.hasQuirk(myQuirk));
  }

  public void testDeleteQuirk() {
    ArrayList<Quirks> list = new ArrayList<Quirks>();
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    list.add(myQuirk);
    list.delete(myQuirk);
    assertFalse(list.hasQuirk(myQuirk));
  }

  public void testGetQuirk() {
    ArrayList<Quirks> list = new ArrayList<Quirks>();
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    list.add(myQuirk);
    Quirk returnedquirk = list.getQuirk(0);
    assertEquals(myQuirk.isEquals(returnedquirk));
  }

  // Testing quirk reason
  public void testGetQuirkReason() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123, "Feel better");
    assertEquals("Feel better", myQuirk.getReason());
  }

  public void testSetQuirkReason() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.setReason("for the gains");
    String reason = myQuirk.getReason();
    assertEquals("for the gains", reason);
  }

  // Testing quirk occurences
  public void testGetOccurences() {
    ArrayList<Day> occurence = new ArrayList<Day>();
    occurence.add(Monday);
    occurence.add(Tuesday);
    Quirk myQuirk = new Quirk("some_type", "some_title", 123, occurence);
    ArrayList<Day> returnedOccurence = myQuirk.getOccurences();
    assertTrue(occurence.containsAll(returnedOccurence) && returnedOccurence.containsAll(occurence));
  }

  public void testAddOccurence() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    // Tuesday is an enum value
    myQuirk.addOccurence(Tuesday);
    ArrayList<Occurence> occurences = myQuirk.getOccurences();
    assertTrue(Arrays.asList(occurences).contains(Tuesday));
  }

  public void testRemoveOccurence() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    // Tuesday is an enum value
    myQuirk.addOccurence(Tuesday);
    myQuirk.deleteOccurence(Tuesday);
    ArrayList<Occurence> occurences = myQuirk.getOccurences();
    assertFalse(Arrays.asList(occurences).contains(Tuesday));
  }

  // Test goal
  public void testGetGoalQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    assertEquals(myQuirk.getGoal(), 123);
  }

  public void testSetGoalQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.setGoal(170);
    assertEquals(myQuirk.getGoal(), 170);
  }

  // Test logging event
  public void testAddEvent() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);

    ArrayList<Event> events = myQuirk.getEvents();
    Event event = new Event("some event");
    events.addEvent(event);
    assertTrue(events.hasEvent(event));
  }

  public void testGetEvents() {
    Quirk myQuirk = newQuirk("some_type", "some_title", 123);
    ArrayList<Event> events = myQuirk.getEvents();
    event event = new Event("test");
    Event event = new Event("some event");
    events.addEvent(event);
    event returnedevent = events.getEvent(0);
    assertEquals(returnedevent.isEquals(event));
  }

  // Test progressing quirk
  public void testGetProgress() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    // Should have no progress new quirk, 123 is goal
    assertEquals(myQuirk.getProgress(), 0);
  }

  public void testSetProgress() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.setProgress(5);
    assertEquals(myQuirk.getProgress(), 5);
  }

  public void testAddProgress() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    int previous = myQuirk.getProgress();
    myQuirk.addProgress();
    assertEquals(myQuirk.getProgress(), previous + 1);
  }

  public void testSubtractProgress() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    int previous = myQuirk.getProgress();
    myQuirk.subtractProgress();
    assertEquals(myQuirk.getProgress(), previous - 1);
  }

  // Test title
  public void testGetTitle() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    assertEquals("some_title", myQuirk.getTitle());
  }

  public void testSetTitle() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.setTitle("new title");
    assertEquals("new title", myQuirk.getTitle());
  }

  // Test type
  public void testGetType() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    assertEquals("some_type", myQuirk.getType());
  }

  public void testSetTitle() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.setTitle("new type");
    assertEquals("new type", myQuirk.getTitle());
  }

  // Test start date
  public void testGetDate() {
    Date now = new Date();
    Quirk myQuirk = new Quirk("some_type", "some_title", 123, now);
    assertEquals(now, getDate());
  }

  public void testSetDate() {
    Date now = new Date();
    Quirk myQuirk = new Quirk("some_type", "some_title", 123, now);
    // Some date here
    Date newDate = new Date("YYYY-mm-dd");
    myQuirk.setDate(newDate);
    assertEquals(newDate, getDate());
  }
}
