package composition;

import java.util.ArrayList;

public class ScoreBoard {

    private ArrayList<Player> players;
    private IO io = new IO();

    public ScoreBoard (ArrayList<Player> players){
        this.players = players;
    }

    public ScoreBoard (){
        players = new ArrayList<>();
    }

    public void addPlayer(Player p){
        if(players.size() == 0) {
            players.add(p);
            return;
        }
        for(int i= 0; i < players.size(); i++){
            if(p.getScore() < players.get(i).getScore())
                players.add(i, p);
        }
    }

    public Player findPlayer(String name){
        for(Player p: players){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

    public void printTopTenAgain(){
        for(int i = 0; i < 10; i++){
            io.sendMessage(players.get(i).getName() + ": " + players.get(i).getScore());
        }
    }

    public void printTopTen(){
        Player previous = null;
        for(int i = 0; i < 10; i++){
            Player lowest = players.get(0);
            for(Player p: players){
                if(p.getScore() < lowest.getScore()){
                    if(previous != null && p.getScore() > previous.getScore()) {
                        lowest = p;
                    }
                    else
                        lowest = p;
                }
            }
            previous = lowest;
            io.sendMessage(lowest.getName() + ": " + lowest.getScore());
        }
    }


}
