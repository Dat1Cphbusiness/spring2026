package composition;

public class SmartComputerPlayer extends Player{
    int min;
    int max;
    int previousGuess;

    public SmartComputerPlayer(){
        super(0);
        min = 1;
        max = 100;
    }

    @Override
    public int getGuess(){
        previousGuess = (max+min)/2;
        return previousGuess;
    }

    @Override
    public void responseToGuess(int response){
        if(response < 0){
            min = previousGuess;
        }
        else if(response > 0){
            max = previousGuess;
        }
    }

    @Override
    public String getName(){
        return "Smart Computer";
    }
}
