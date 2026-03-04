package composition;

public class Player {

   protected int score;

    public Player(int score) {
        this.score = score;
    }

    public boolean play() {
        return true;
    }

    public int getGuess(){
        return 0;
    }

    // sende positivt tal hvis gæt er for højt
    // negativ hvis det er for lavt
    // 0 hvis det er korrekt
    public void responsToGuess(int respons){

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
