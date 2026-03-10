package composition;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreBoard {

    // Usorteret liste
    private ArrayList<Player> players;
    // Sorteret liste
    private ArrayList<Player> sortedList;

    private IO io = new IO();

    public ScoreBoard (){
        players = new ArrayList<>();
        sortedList = new ArrayList<>();
    }

    public void addPlayer(Player p){
        // Indsætter i den usortede liste
        players.add(p);
        // og her indsætter vi så i den sorterede
        addPlayerSorted(p);
    }

    // Holder sortedlist sorteret
    private void addPlayerSorted(Player p){
        // Hvis der ikke er nogen i listen, så indsætter vi bare
        if(sortedList.size() == 0) {
            sortedList.add(p);
            return;
        }
        // Hvis der allerede er players, så finder vi den første Player, vi er mindre end
        // og indsætter os selv på den plads. Alle andre Player-objekter rykker en plads
        // ned i listen. Fx hvis vi indsætter på index 3 så bliver den Player der før var
        // på index 3 er nu på index 4 osv.
        for(int i= 0; i < sortedList.size(); i++){
            if(p.getScore() < sortedList.get(i).getScore()) {
                sortedList.add(i, p);
                return;
            }
        }

        // Hvis vi er den dårligste spiller og dermed ikke er blevet sat ind foran nogen,
        // så sættes vi ind på den sidste plads
        sortedList.add(p);
    }

    public Player findPlayer(String name){
        for(Player p: players){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

    public void sortAndPrint(){
        Collections.sort(players);
        for(int i = 0; i < 10 && i < players.size(); i++){
            io.sendMessage(players.get(i).getName() + ": " + players.get(i).getScore());
        }
    }

    public void printTopTenFromSorted(){
        // Her printer vi bare de ti første, da listen er sorteret
        // MEN vi tjekker lige om der er 10 players da koden ellers vil fejle
        // i skal altså køre fra 0 - 9 MEDMINDRE der er færre end 10 players
        for(int i = 0; i < 10 && i < sortedList.size(); i++){
            io.sendMessage(sortedList.get(i).getName() + ": " + sortedList.get(i).getScore());
        }
    }

    public void printTopTen(){
        // Her kører vi players igennem og den liste er ikke sorteret, så vi må selv
        // finde ud af hvem der er de laveste 10
        // Det betyder at vi skal holde styr på hvem der lige er blevet printet og
        // det gør vi med variablen previous, som starter med at være null (der er
        // ikke printet nogen)
        Player previous = null;
        // Derefter kører vi en løkke 10 gange ELLER til der ikke er flere Player-
        // objekter i listen
        for(int i = 0; i < 10 && i < players.size(); i++){
            // For hver iteration sætter vi lowest til null.
            Player lowest = null;
            // Så kører vi listen igennem og finder den, som er lavere end lowest
            // men højere end previous
            for(Player p: players){
                // Så hvis der ikke er en previous eller vi er højere end previous
                if(previous == null || p.getScore() > previous.getScore()){
                    // Og der ikke er en lowest eller vi er lavere end lowest
                    if(lowest == null || p.getScore() < lowest.getScore()){
                        // Så er vi nu den laveste (som er højere end previous)
                        lowest = p;
                    }
                }
            }
          // Og så sætter vi os til at være previous og printer
            previous = lowest;
            io.sendMessage(lowest.getName() + ": " + lowest.getScore());
        }
    }

}