package composition;

import java.util.ArrayList;

public class GameHistory {
    // klassen der holder styr på en spillers gæt-historik
    private ArrayList<Integer> guesses; // listen der gemmer alle gæt som heltal
    private IO io;

    public GameHistory(IO io){ // konstruktør der kører når vi laver et nyt GameHistory objekt
        guesses = new ArrayList<>();

        this.io = io;// initialiserer listen så den er klar til brug
    }

    public void addGuess(int guess){ // metode der tilføjer ét gæt til historikken
        guesses.add(guess); // tilføjer gættet til listen
    }

    public void printHistory(){ // metode der printer alle gæt i rækkefølge
        int count = 1; // tæller der starter på 1, bruges til at nummerere gættene
        for(int guess : guesses){ // løber alle gæt i listen igennem ét ad gangen
            io.sendMessage("Gæt " + count + ": " + guess); // printer nummeret og gættet
            count++; // tæller én op så næste gæt får det rigtige nummer
        }
    }

    public int getGuessCount(){ // metode der returnerer hvor mange gæt spilleren har afgivet
        return guesses.size(); // size() returnerer antal elementer i listen
    }
}
