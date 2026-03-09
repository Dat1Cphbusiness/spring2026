package composition;

import java.util.Random;

public abstract class StupidComputer extends Player{

    public StupidComputer(){
        super(0);
    }

    @Override
    public int getGuess(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    @Override
    public String getName(){
        return "Stupid Computer";
    }


}
