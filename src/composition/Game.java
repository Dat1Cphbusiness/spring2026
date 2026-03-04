package composition;

import java.util.Random;

public class Game {
    private int answer;
    private IO io;
    private Player currentPlayer;
    private ScoreBoard scoreBoard;

    public Game(IO io){
        super();
        this.io = io;
        scoreBoard = new ScoreBoard();
    }

    public void startGame(){

        // Vi skal bruge IO til dette
        // Velkommen til bruger (regler: skriv q for at stoppe)
        io.sendMessage("Velkommen til \n \"Gæt et tal\" ");
        // Spørg bruger om navn
        double d = Math.random();
        if(d < 0.3){
            String playerName = io.promptString("Hvad er dit navn");
            currentPlayer = new HumanPlayer(playerName, 0, io);
        }
        else if (d < 0.6){
            currentPlayer = new SmartComputerPlayer();
        }
        else {
            currentPlayer = new StupidComputer();
        }
        boolean play = currentPlayer.play();

        // hvis brugerinput er y så kør nyt spil
        if(play){
            io.sendMessage("Fint! Lad os spille " + currentPlayer.getName());

         //   io.sendMessage("Du skal gætte et tal mellem 1 og 100");
            // Opret et answer
            Random random = new Random();
            answer = random.nextInt(100) + 1;
            io.sendMessage("Shhhh tallet er " + answer);
            playGame();
        }
    }

    private void playGame(){
        boolean guessed = false;
        int noOfGuesses = 0;
        while(!guessed) {
            // Bed spiller om gæt
            int result = currentPlayer.getGuess();
            io.sendMessage(currentPlayer.getName() + ", du gættede på " + result);
            // Hold styr på antal gæt
            noOfGuesses++;
            // Tre muligheder: korrekt, for højt, for lavt
            // Hvis korrekt: Fortæl bruger det er korrekt
            // Tildel score til Player
            // Returner til startGame
            if(result == answer) {
                guessed = true;
                currentPlayer.setScore(noOfGuesses);
                currentPlayer.responsToGuess(0);
                scoreBoard.addPlayer(currentPlayer);
                io.sendMessage("Tallet blev gættet af " +
                        currentPlayer.getName() + " på " + noOfGuesses + " gæt.");
              //  currentPlayer.getGameHistory().addGuess(noOfGuesses);
            }
            // Hvis det er for lavt eller for højt
            // Fortæl bruger om det er for højt eller for lavt
            // Giv bruger mulighed for at gætte igen eller afbryde spil
            else if(result > answer){
                currentPlayer.responsToGuess(1);
            } else if(result < answer){
                currentPlayer.responsToGuess(-1);
            }
        }

    }

}
