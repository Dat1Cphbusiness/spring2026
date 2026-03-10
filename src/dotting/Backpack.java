package dotting;

import java.util.ArrayList;

public class Backpack {

    ArrayList<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public Item getItemByDescription(String description){
        for(Item i:items){
            if(i.getDescription().equals(description))
                return i;
        }
        return null;
    }
}
