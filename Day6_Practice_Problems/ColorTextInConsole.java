package Day_6_Practice_Problem;

public class ColorTextInConsole {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {

        System.out.println(RED + "This is Red Text" + RESET);
        System.out.println(GREEN + "This is Green Text" + RESET);
        System.out.println(YELLOW + "This is Yellow Text" + RESET);
        System.out.println(BLUE + "This is Blue Text" + RESET);
    }
}
