package inheritance;

public class Main {


    public static void main(String[] args) {


      //  Item item1 = new Item();
        Item apple = new Food("Apple", 40, 100);
        Item sword = new Weapon(50);

        int result = apple.use();
        int result2 = sword.use();
        if(apple instanceof Food) {
            Food downCastedApple = (Food) apple;
            downCastedApple.reduceFreshness();
        }

        Hero hero = new Hero();
        hero.addItem(new Food("Bread", 45, 100));
        hero.addItem(new Weapon(100));




      //  Item apple = new Food("Apple", 40, 100);
        int nutrition = apple.use();
       // apple.reduceFreshness();

        Food appleDownCastet = (Food) apple;
        appleDownCastet.reduceFreshness();


        Food bread = new Food("Bread", 60, 70);
        int nutrition2 = bread.use();
        bread.reduceFreshness();






    }
}
