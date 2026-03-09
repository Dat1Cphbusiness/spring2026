package inheritance;

public class Weapon implements Item{

    private int force;
    private int damage;

    public Weapon (int force){
        this.force = force;
    }

    public void setDamage(){
        this.damage = damage;
    }

    @Override
    public int use(){
        return force - damage;
    }
}



