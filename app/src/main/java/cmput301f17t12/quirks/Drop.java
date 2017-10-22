package cmput301f17t12.quirks;

/**
 * Created by thomas on 2017-10-21.
 */

public class Drop implements Tradable {
    public String rarity;
    public User user;
    public String name;

    public Drop(String rarity, User user, String name){
        this.rarity = rarity;
        this.user = user;
        this.name = name;
    }

    private void setDropUser(Drop drop){
        // @TODO - is this a duplicate of set and get user?
    }

    private String getDropUser(){
        // @TODO - is this a duplicate of set and get user?
        return "";
    }

    public String dropDetails(){
        return "";
    }

    public String getRarity(){
        return rarity;
    }

    public void setRarity(String rarity){
        this.rarity = rarity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public boolean trade(User user, Drop drop){
        return false;
    }
}
