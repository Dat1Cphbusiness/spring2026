package composition;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new GraphicIO());
      //  game.startGame();

        IO io = new IO();


     //   Player player1 = new Player(0);
        Player player2 = new HumanPlayer("Signe", 0, io);
        Player player3 = new SmartComputerPlayer();



      //  GraphicIO io = new GraphicIO();
      //  io.sendMessage("Test colors");

    //Test af topti-print fra ScoreBoard:
        Player a = new HumanPlayer("a", 10, io);
        Player b = new SmartComputerPlayer();
        Player c = new StupidComputer();
        Player d = new HumanPlayer ("d", 14, io);
        Player e = new HumanPlayer("e", 6, io);
        Player f = new SmartComputerPlayer();
        Player g = new HumanPlayer ("g", 41, io);
        Player h = new HumanPlayer ("h", 44, io);
        Player i = new HumanPlayer ("i", 80, io);
        Player j = new HumanPlayer ("j", 22, io);
        Player k = new HumanPlayer ("k", 55, io);
        //Player l = new Player ("l", 34);
        //Player m = new Player ("m", 65);

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
       // scoreboard1.addPlayer(l);
        // scoreboard1.addPlayer(m);

        scoreboard1.sortAndPrint();
      //  scoreboard1.printTopTenFromSorted();
      //  System.out.println("----------------------------------------------");
        //  scoreboard1.printTopTen();




        /* Test af players setScore-metode
        Player p = new Player("Signe", 10);
        System.out.println(p);
        p.setScore(12);
        System.out.println(p);*/


    }
}
