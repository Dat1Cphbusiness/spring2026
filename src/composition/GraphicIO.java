package composition;

import static composition.TextColor.*;

public class GraphicIO extends IO {

    @Override
    public void sendMessage(String msg){
        System.out.println(RED.getCode() + msg + RESET);

    }

    @Override
    public String promptString(String msg){
        System.out.println(GREEN + msg + RESET);
        String input = scanner.nextLine();
        return input;
    }

    @Override
    public int promptInt(String msg){
        System.out.println(BLUE + msg + RESET);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }





}
