package dotting;

public class Item {

    private String description;
    private int weight;

    public Item(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
