

public class QuirkListTest {


  // Test to getList from QuirkList
  public void testGetList() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);

    QuirkList myQuirkList = new Inventory();
    myQuirkList.addQuirk(myQuirk);
    assertEquals(myQuirkList.getList().contains(myQuirk));

    ArrayList<Quirk> quirkList = new ArrayList<Drop>();
    quirkList.add(myQuirk);

    assertEquals(myQuirkList.getList, quirkList);
  }
  
  // Test adding Quirk to QuirkList
  public void testAddQuirk() {
  	Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    QuirkList myQuirkList = new Inventory();
    myQuirkList.addQuirk(myQuirk);
    assertEquals(myQuirkList.getList().contains(myQuirk));
  }

  // Test if Quirk exists in QuirkList
  public void testHasQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    QuirkList myQuirkList = new Inventory();
    myQuirkList.addQuirk(myQuirk);
    assertTrue(myQuirkList.hasQuirk(myQuirk));
  }

   // Test to return the Quirk at location from QuirkList
  public void testGetQuirk() {
    Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    QuirkList myQuirkList = new Inventory();
    myQuirkList.addQuirk(myQuirk);
    assertEquals(myQuirkList.getQuirk(0), myQuirk);
  }

  // Test to remove Quirk from QuirkList
  public void testDeleteQuirk() {
  	Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    QuirkList myQuirkList = new Inventory();
    myQuirkList.addQuirk(myQuirk);
    myQuirkList.removeQuirk(myQuirk);
    asserTrue(myQuirkList.getList().contains(myQuirk));
  }

}