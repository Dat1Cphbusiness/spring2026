package composition;

public abstract class Player implements Comparable<Player> {
   protected int score;

    public Player(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player other){
        if (this.score == 0)
            return 1;
        else if(this.score < other.score)
            return -1;
        else if (this.score == other.score)
            return 0;
        return 1;
    }

    public boolean play() {
        return true;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score < this.score)
            this.score = score;
    }

    public abstract int getGuess();

    public abstract void responseToGuess(int response);

    public abstract String getName();

    @Override
    public String toString() {
        return "Player{" +
                ", score=" + score +
                '}';
    }
}




// sende positivt tal hvis gæt er for højt
// negativ hvis det er for lavt
// 0 hvis det er korrekt
