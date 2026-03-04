package composition;

public class Player {

   protected int score;

    public Player(int score) {
        this.score = score;
    }

    public int getGuess(){
        return 0;
    }

    public String getName(){
        return null;
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
                ", score=" + score +
                '}';
    }
}
