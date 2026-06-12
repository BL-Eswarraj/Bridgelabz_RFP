package Day_5_Practice_Problem;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        findEvenOrOdd(n);
    }

    private static void findEvenOrOdd(int n) {
        if (n < 0) {
            System.out.print("Enter a positive number.\n");
        } else if (n % 2 == 0) {
            System.out.print("The number " + n + " is Even \n");
        }else{
            System.out.print("The number " + n + " is Odd \n");

        }    }
}
