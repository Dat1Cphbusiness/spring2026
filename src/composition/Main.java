package composition;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
      //  game.startGame();

        GraphicIO io = new GraphicIO();
        io.sendMessage("Test colors");

/*
        Player a = new Player("a", 10);
        Player b =new Player("b", 9);
        Player c = new Player("c", 8);
        Player d = new Player ("d", 14);
        Player e = new Player("e", 6);
        Player f = new Player("f", 15);
        Player g = new Player ("g", 41);
        Player h = new Player ("h", 44);
        Player i = new Player ("i", 80);
        Player j = new Player ("j", 22);
        Player k = new Player ("k", 55);
        Player l = new Player ("l", 34);
        Player m = new Player ("m", 65);

        ScoreBoard scoreboard1 = new ScoreBoard();

        scoreboard1.addPlayer(a);
        scoreboard1.addPlayer(b);
        scoreboard1.addPlayer(c);
        scoreboard1.addPlayer(d);
        scoreboard1.addPlayer(e);
        scoreboard1.addPlayer(f);
        scoreboard1.addPlayer(g);
        scoreboard1.addPlayer(h);
        scoreboard1.addPlayer(i);
        scoreboard1.addPlayer(j);
        scoreboard1.addPlayer(k);
        scoreboard1.addPlayer(l);
        scoreboard1.addPlayer(m);

        scoreboard1.printTopTenAgain();*/

        /* Test af players setScore-metode
        Player p = new Player("Signe", 10);
        System.out.println(p);
        p.setScore(12);
        System.out.println(p);*/


    }
}
