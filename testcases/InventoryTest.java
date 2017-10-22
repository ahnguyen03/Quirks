

public class InventoryTest {

  // Test adding Quirk to inventory
  public void testAddDrop() {
  	Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(drop);
    ArrayList<Drop> dropList = new ArrayList<Drop>();
    dropList.add("drop");

    assertEquals(myInventory, dropList);
  }

  // Test if Quirk exists in Inventory
  public void testHasDrop() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(Quirk);
    assertTrue(myInventory.hasDrop(drop));
  }

   // Test to return the Quirk at location from Inventory
  public void testGetDrop() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(Quirk);

    assertEquals(myInventory.getDrop(0), drop);
  }

  // Test to remove Quirk from Inventory
  public void testRemoveDrop() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(drop);
    ArrayList<Drop> dropList = new ArrayList<Drop>();
    myInventory.removeDrop(drop);
    assertEquals(myInventory, dropList);
  }

  // Test to remove Quirk from Inventory
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