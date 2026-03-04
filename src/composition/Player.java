package composition;

public class Player {

    private String name;
    private int score;
    private GameHistory gameHistory;

    public Player(String name) {
        this(name, 0, new IO());

    }

    public Player(String name, int score, IO io) {
        this.name = name;
        this.score = score;
        this.gameHistory = new GameHistory(io);
    }

    public GameHistory getGameHistory() {
        return gameHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score < this.score)
            this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
