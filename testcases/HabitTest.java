public class HabitTest {

  // Testing habit list
  public void testAddHabit() {
    ArrayList<Habits> list = new ArrayList<Habits>();
    Habit myHabit = new Habit("some_type", "some_title", 123);
    list.add(myHabit);
    assertTrue(list.hasHabit(myHabit));
  }

  public void testDeleteHabit() {
    ArrayList<Habits> list = new ArrayList<Habits>();
    Habit myHabit = new Habit("some_type", "some_title", 123);
    list.add(myHabit);
    list.delete(myHabi);
    assertFalse(list.hasHabit(myHabit));
  }

  public void testGetHabit() {
    ArrayList<Habits> list = new ArrayList<Habits>();
    Habit myHabit = new Habit("some_type", "some_title", 123);
    list.add(myHabit);
    Habit returnedhabit = list.getHabit(0);
    assertEquals(myHabbit.isEquals(returnedhabit));
  }

  // Testing habit reason
  public void testGetHabitReason() {
    Habit myHabit = new Habit("some_type", "some_title", 123, "Feel better");
    assertEquals("Feel better", myHabit.getReason());
  }

  public void testSetHabitReason() {
    Habit myHabit = new Habit("some_type", "some_title", 123);
    myHabit.setReason("for the gains");
    String reason = myHabit.getReason();
    assertEquals("for the gains", reason);
  }

  // Testing habit occurences
  public void testGetOccurences() {
    ArrayList<Day> occurence = new ArrayList<Day>();
    occurence.add(Monday);
    occurence.add(Tuesday);
    Habit myHabit = new Habit("some_type", "some_title", 123, occurence);
    ArrayList<Day> returnedOccurence = myHabit.getOccurences();
    assertTrue(occurence.containsAll(returnedOccurence) && returnedOccurence.containsAll(occurence));
  }

  public void testAddOccurence() {
    Habit myHabit = new Habit("some_type", "some_title", 123);
    // Tuesday is an enum value
    myHabit.addOccurence(Tuesday);
    ArrayList<Occurence> occurences = myHabit.getOccurences();
    assertTrue(Arrays.asList(occurences).contains(Tuesday));
  }

  public void testRemoveOccurence() {
    Habit myHabit = new Habit("some_type", "some_title", 123);
    // Tuesday is an enum value
    myHabit.addOccurence(Tuesday);
    myHabit.deleteOccurence(Tuesday);
    ArrayList<Occurence> occurences = myHabit.getOccurences();
    assertFalse(Arrays.asList(occurences).contains(Tuesday));
  }

  // Test editing a habit
  public void testEditTitleHabit() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    myHabit.editAttribute("title", "some_new_value");
    assertEquals(myHabit.getTitle(), "some_new_value");
  }

  public void testEditTypeHabit() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    myHabit.editAttribute("type", "some_new_type");
    assertEquals(myHabit.getType(), "some_new_type");
  }

  public void testEditGoalHabit() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    myHabit.editAttribute("goal", 170);
    assertEquals(myHabit.getGoal(), 170);
  }

  // Test logging event
  public void testAddEvent() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    ArrayList<Event> events = myHabit.getEvents();
    Event event = new event("new event", "attribute2", "attribute3", "attribute4");
    events.addEvent(event);
    assertTrue(events.hasEvent(event));
  }

  public void testDeleteEvent() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    ArrayList<Event> events = myHabit.getEvents();
    Event event = new event("new event", "attribute2", "attribute3", "attribute4");
    events.addEvent(event);
    events.delete(event);
    assertFalse(events.hasevent(event));
  }

  public void testGetevent() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    ArrayList<Event> events = myHabit.getEvents();
    event event = new event("test");
    Event event = new event("new event", "attribute2", "attribute3", "attribute4");
    events.addEvent(event);
    event returnedevent = events.getEvent(0);
    assertEquals(returnedevent.isEquals(event));
  }

  // Test progressing habit
  public void testGetProgress() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    assertEquals(myHabit.getProgress(), 0);
  }

  public void testSetProgress() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    myHabit.setProgress(5);
    assertEquals(myHabit.getProgress(), 5);
  }

  public void testAddProgress() {
    Habit myHabit = newHabit("some_type", "some_title", 123);
    int previous = myHabit.getProgress();
    myHabit.addProgress();
    assertEquals(myHabit.getProgress(), previous + 1);
  }
}
