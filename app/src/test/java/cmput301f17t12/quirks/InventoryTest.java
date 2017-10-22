package cmput301f17t12.quirks;

import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {

    // Test to getInventory
    @Test
    public void testGetList() {
        Drop drop = new Drop("drop", "this is drop", "Rare");
        Drop drop1 = new Drop("drop1", "this is drop1", "Common");

        Inventory myInventory = new Inventory();
        myInventory.addQuirk(drop);
        myInventory.addQuirk(drop);

        ArrayList<Drop> dropList = new ArrayList<Drop>();
        dropList.add(drop);
        dropList.add(drop1);

        assertEquals(myInventory.getList(), dropList);
    }

    // Test adding Drop to inventory
    @Test
    public void testAddDrop() {
        Drop drop = new drop("drop", "this is drop", "Rare");
        Inventory myInventory = new Inventory();
        myInventory.addQuirk(drop);

        asserTrue(myInventory.getList().contains(drop));
    }

    // Test if Drop exists in Inventory
    @Test
    public void testHasDrop() {
        Drop drop = new drop("drop", "this is drop", "Rare");
        Inventory myInventory = new Inventory();
        myInventory.addQuirk(Quirk);

        assertTrue(myInventory.hasDrop(drop));
    }

    // Test to return the Drop at location from Inventory
    @Test
    public void testGetDrop() {
        Drop drop = new drop("drop", "this is drop", "Rare");
        Inventory myInventory = new Inventory();
        myInventory.addQuirk(Quirk);

        assertEquals(myInventory.getDrop(0), drop);
    }

    // Test to remove Drop from Inventory
    @Test
    public void testRemoveDrop() {
        Drop drop = new drop("drop", "this is drop", "Rare");
        Inventory myInventory = new Inventory();
        myInventory.addQuirk(drop);
        myInventory.removeDrop(drop);
        assertFalse(myInventory.getList().contains(drop));
    }
}

