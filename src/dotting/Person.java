package dotting;

import java.util.ArrayList;

public class Person {

    String name;
    Backpack backpack = new Backpack();

    public Person(String name) {
        this.name = name;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void addToBackpack(Item item){
        backpack.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
