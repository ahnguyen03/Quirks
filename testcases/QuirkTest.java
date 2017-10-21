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

  // Test editing a quirk
  public void testEditTitleQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.editAttribute("title", "some_new_value");
    assertEquals(myQuirk.getTitle(), "some_new_value");
  }

  public void testEditTypeQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.editAttribute("type", "some_new_type");
    assertEquals(myQuirk.getType(), "some_new_type");
  }

  public void testEditGoalQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    myQuirk.editAttribute("goal", 170);
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

  public void testDeleteEvent() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    ArrayList<Event> events = myQuirk.getEvents();
    Event event = new Event("some event");
    events.addEvent(event);
    events.delete(event);
    assertFalse(events.hasevent(event));
  }

  public void testGetevent() {
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
}
