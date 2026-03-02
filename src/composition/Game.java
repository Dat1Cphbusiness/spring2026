package composition;

public class Game {
    private int answer;
    private boolean quit = false;
    private IO io = new IO();

    public void startGame(){
        // Velkommen til bruger (regler: skriv q for at stoppe)

        // Spørg bruger om navn
        // Vi skal bruge IO til dette

        // Vil du spille spil y/n

        // så længe brugerinput er y så kør nyt spil

        // Opret et answer

        // start runde

    }


    private void playRound(){
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
