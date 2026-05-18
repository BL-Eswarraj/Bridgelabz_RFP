package Day_6_Practice_Problem;

import java.util.Scanner;

public class StopWatch {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------------ Stopwatch application ------------\n");

        System.out.print("Press ENTER to START : ");
        sc.nextLine();
        long start = System.currentTimeMillis();

        System.out.print("Press ENTER to STOP : ");
        sc.nextLine();
        long end = System.currentTimeMillis();

        long ms = end - start;
        double seconds = ms / 1000.0;
        System.out.print("\nThe time take from start to end is " +GREEN + seconds + RESET + " s\n\n");
    }
}
