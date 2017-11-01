package cmput301f17t12.quirks.Models;

import java.util.ArrayList;

/**
 * Created by thomas on 2017-10-22.
 */

public class Inventory {
    private ArrayList<Drop> inventory = new ArrayList<Drop>();

    public Inventory(){

    }

    public void addDrop(Drop drop){
        inventory.add(drop);
    }

    public boolean hasDrop(Drop drop){
        return inventory.contains(drop);
    }

    public Drop getDrop(int i){
        return inventory.get(i);
    }

    public void removeDrop(Drop drop){
        inventory.remove(drop);
    }

    public ArrayList<Drop> getList(){
        return inventory;
    }




}
