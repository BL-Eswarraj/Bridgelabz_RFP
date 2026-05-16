package Day_5_Practice_Problem;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        findPrimeFactor(n);
    }

    private static void findPrimeFactor(int n) {
        if (n <= 1) {
            System.out.print("The integer is Lesser than 1.");
            return;
        }
        //calculating the even factors
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        //calculating the odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
