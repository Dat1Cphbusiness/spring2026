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
    public void responsToGuess(int i){
        if(i < 0){
            min = previousGuess;
        }
        else if(i > 0){
            max = previousGuess;
        }
    }

    @Override
    public String getName(){
        return "Smart Computer";
    }



}
