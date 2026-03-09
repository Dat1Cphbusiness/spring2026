package composition;

public class HumanPlayer extends Player{
    private String name;
    private IO io;

    public HumanPlayer(String name, int score, IO io) {
        super(score);
        this.name = name;
        this.io = io;
    }

    @Override
    public int getGuess(){
        int result = io.promptInt("Indtast et tal");
        return result;
    }

    @Override
    public void responseToGuess(int response){
        if(response > 0)
            io.sendMessage("Desværre - gættet var for højt");
        else if (response < 0)
            io.sendMessage("Desværre - gættet var for lavt");
        else io.sendMessage("Tillykke " + name +
                    ". Du har gættet tallet!");
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean play(){
        String input = io.promptString("Vil du spille et nyt spil? y/n");
        if (input.equals("y")) return true;
        else return false;
    }
}
