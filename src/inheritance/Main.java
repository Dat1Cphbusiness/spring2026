package inheritance;

public class Main {


    public static void main(String[] args) {


        Item item1 = new Item();
        Item item2 = new Food("Apple", 40, 100);
        Item item3 = new Weapon(50);


        Item apple = new Food("Apple", 40, 100);
        int nutrition = apple.use();
        apple.reduceFreshness();

        Food appleDownCastet = (Food) apple;
        appleDownCastet.reduceFreshness();


        Food bread = new Food("Bread", 60, 70);
        int nutrition2 = bread.use();
        bread.reduceFreshness();






    }
}
