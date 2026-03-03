package composition;

public class GraphicIO extends IO {

    @Override
    public void sendMessage(String msg){
        System.out.println("\u001B[31m\u001B[44m" + msg + "\u001B[0m");
    }

    @Override
    public String promptString(String msg){
        System.out.println(msg);
        String input = scanner.nextLine();
        return input;
    }

    @Override
    public int promptInt(String msg){
        System.out.println(msg);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }





}
