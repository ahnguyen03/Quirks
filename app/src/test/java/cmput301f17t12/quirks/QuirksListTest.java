package cmput301f17t12.quirks;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuirksListTest {

    // Test to getList from QuirkList
    @Test
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
    @Test
    public void testAddQuirk() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        QuirkList myQuirkList = new Inventory();
        myQuirkList.addQuirk(myQuirk);
        assertEquals(myQuirkList.getList().contains(myQuirk));
    }

    // Test if Quirk exists in QuirkList
    @Test
    public void testHasQuirk() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        QuirkList myQuirkList = new Inventory();
        myQuirkList.addQuirk(myQuirk);
        assertTrue(myQuirkList.hasQuirk(myQuirk));
    }

    // Test to return the Quirk at location from QuirkList
    @Test
    public void testGetQuirk() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        QuirkList myQuirkList = new Inventory();
        myQuirkList.addQuirk(myQuirk);
        assertEquals(myQuirkList.getQuirk(0), myQuirk);
    }

    // Test to remove Quirk from QuirkList
    @Test
    public void testDeleteQuirk() {
        Quirk myQuirk = new Quirk("some_type", "some_title", 123);
        QuirkList myQuirkList = new Inventory();
        myQuirkList.addQuirk(myQuirk);
        myQuirkList.removeQuirk(myQuirk);
        assertFalse(myQuirkList.getList().contains(myQuirk));
    }

}
