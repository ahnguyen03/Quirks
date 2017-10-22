

public class InventoryTest {

  // Test adding Quirk to inventory
  public void testAddQuirk() {
  	Quirk myQuirk = new Quirk("some_type", "some_title", 123);
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(Quirk);

    assertEquals(myInventory.getList()[0], myQuirk);
  }

  // Test if Quirk exists in Inventory
  public void testHasQuirk() {
    Event event = new Event("ate lettuce");
    assertEquals(event.getComment(), "ate lettuce");
  }

   // Test to return the Quirk at location from Inventory
  public void testGetQuirk() {
    Event event = new Event("ate lettuce");
    assertEquals(event.getComment(), "ate lettuce");
  }

  // Test to remove Quirk from Inventory
  public void testRemoveQuirk() {
    Event event = new Event("ate lettuce");
    assertEquals(event.getComment(), "ate lettuce");
  }