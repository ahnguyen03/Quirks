

public class InventoryTest {

    // Test to getInventory 
  public void testGetList() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Drop drop1 = new drop("drop1", "this is drop1", "Common");

    Inventory myInventory = new Inventory();
    myInventory.addQuirk(drop);
    myInventory.addQuirk(drop);

    ArrayList<Drop> dropList = new ArrayList<Drop>();
    dropList.add(drop);
    dropList.add(drop1);

    assertEquals(myInventory.getList(), dropList);
  }
  
  // Test adding Drop to inventory
  public void testAddDrop() {
  	Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(drop);

    asserTrue(myInventory.getList().contains(drop));
  }

  // Test if Drop exists in Inventory
  public void testHasDrop() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(Quirk);
    assertTrue(myInventory.hasDrop(drop));
  }

   // Test to return the Drop at location from Inventory
  public void testGetDrop() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(Quirk);

    assertEquals(myInventory.getDrop(0), drop);
  }

  // Test to remove Drop from Inventory
  public void testRemoveDrop() {
    Drop drop = new drop("drop", "this is drop", "Rare");
    Inventory myInventory = new Inventory();
    myInventory.addQuirk(drop);
    ArrayList<Drop> dropList = new ArrayList<Drop>();
    myInventory.removeDrop(drop);
    assertFalse(myInventory.getList().contains(drop));
  }
}