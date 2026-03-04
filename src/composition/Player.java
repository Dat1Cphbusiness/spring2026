package composition;

public abstract class Player {

   protected int score;

    public Player(int score) {
        this.score = score;
    }

    public boolean play() {
        return true;
    }

    public abstract int getGuess();

    // sende positivt tal hvis gæt er for højt
    // negativ hvis det er for lavt
    // 0 hvis det er korrekt
    public abstract void responsToGuess(int respons);

    public abstract String getName();

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
