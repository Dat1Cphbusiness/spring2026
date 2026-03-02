package composition;

import java.util.Random;

public class Game {
    private int answer;
    private boolean quit = false;
    private IO io = new IO();
    Player player;

    public void startGame(){
        // Velkommen til bruger (regler: skriv q for at stoppe)
        io.sendMessage("Velkommen til \n \"Gæt et tal\" ");
        // Spørg bruger om navn
        String playerName = io.promptString("Hvad er dit navn");
        player = new Player(playerName);
        // Vi skal bruge IO til dette

        // Vil du spille spil y/n
        String input = io.promptString("Vil du spille et nyt spil?");
        // hvis brugerinput er y så kør nyt spil
        if(input.equals("y")){
            io.sendMessage("Gæt et tal mellem 1 og 100");
            // Opret et answer
            Random random = new Random();
            answer = random.nextInt(100) + 1;
            playGame();
        }
    }

    private void playGame(){
        // Bed spiller om gæt
        // Brug IO om dette
        // Tre muligheder: korrekt, for højt, for lavt
        // Hold styr på antal gæt

        // Hvis korrekt: Fortæl bruger det er korrekt
        // Tildel score til Player
        // Returner til startGame

        // Hvis det er for lavt eller for højt
        // Fortæl bruger om det er for højt eller for lavt
        // Giv bruger mulighed for at gætte igen eller afbryde spil

    }

}
