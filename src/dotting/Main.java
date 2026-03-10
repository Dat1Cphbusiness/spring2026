package dotting;

public class Main {

    public static void main(String[] args) {
        Person hero = new Person("Ragnar");

        hero.addToBackpack(new Item("apple", 50));
        hero.addToBackpack(new Item("socks", 70));
        hero.addToBackpack(new Item("sword", 1000));

        Backpack backpack = hero.getBackpack();
        Item item = backpack.getItemByDescription("socks");
        int weight = item.getWeight();

        int weight2 = hero.getBackpack().getItemByDescription("socks").getWeight();
    }
}
