package inheritance;

import java.util.ArrayList;

public class Hero {

    ArrayList<Item> items = new ArrayList<>();


    public void addItem(Item item){
        items.add(item);
    }

    public void useItems(){
        for(Item item:items){
            item.use();
        }
    }

    public void reduceAll(){
        for(Item i: items){
            if(i instanceof Food){
                Food f = (Food) i;
                f.reduceFreshness();
            }
        }

    }

    public void eatAll(){
        for(Item i: items){
            if(i instanceof  Food){
                i.use();
            }
        }
    }

    public int getTotalWeight(){
        int sum = 0;
     //   for(Item i : otherItems){
      //      sum += i.getWeight();
      //  }

        return sum;
    }


    public void listItems(){
        System.out.println("The hero has:");
        for(Item i : items){
            System.out.println(i);
        }
    }
}
