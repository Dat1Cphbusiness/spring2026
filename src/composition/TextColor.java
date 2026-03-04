package composition;

public enum TextColor {

    RED("\u001B[31m"), BLUE("\u001B[34m"), GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"), PURPLE("\u001B[35m"), RESET("\u001B[0m");

    String code;

    TextColor(String code){
        this.code = code;
    }

    @Override
    public String toString(){
        return code;
    }
}
