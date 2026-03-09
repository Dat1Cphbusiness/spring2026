package inheritance;

public class Food implements Item {

    private int energy;
    private String name;
    private int freshness;

    public Food(String name, int energy, int freshness){
        this.name = name;
        this.energy = energy;
    }

    public void reduceFreshness(){
        freshness--;
    }

    @Override
    public int use(){
        return energy * freshness;
    }
}
