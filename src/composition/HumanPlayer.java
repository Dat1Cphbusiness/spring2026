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
    public String getName(){
        return name;
    }

}
