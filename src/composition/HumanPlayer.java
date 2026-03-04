package composition;

public class HumanPlayer extends Player{

    private String name;
    private GameHistory gameHistory;
    private IO io;


    public HumanPlayer(String name, int score, IO io) {
        // det første der skal ske i en klasse er et kald til superklassens konstruktør
        super(score);
        this.name = name;
        this.io = io;
        gameHistory = new GameHistory(io);
    }


    @Override
    public int getGuess(){
        int result = io.promptInt("Indtast et tal");
        return result;
    }

    @Override
    public void responsToGuess(int i){
        if(i > 0)
            io.sendMessage("Desværre - gættet var for højt");
        else if (i < 0)
            io.sendMessage("Desværre - gættet var for lavt");
        else io.sendMessage("Tillykke " + name +
                    ". Du har gættet tallet!");

    }

    @Override
    public String getName(){
        return name;
    }

    public void printGameHistory(){

    }

    @Override
    public boolean play(){
        // Vil du spille spil y/n
        String input = io.promptString("Vil du spille et nyt spil? y/n");
        if (input.equals("y")) return true;
        else return false;

    }

}
