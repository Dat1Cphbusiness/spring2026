package inheritance;

import java.util.ArrayList;

public class Hero {

    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Item> otherItems = new ArrayList<>();

    public int getTotalWeight(){
        int sum = 0;
        for(Item i : otherItems){
            sum += i.getWeight();
        }

        return sum;
    }


    public void listItems(){
        System.out.println("The hero has:");
        for(Item i : items){
            System.out.println(i);
        }
    }
}
