package Day_5_Practice_Problem;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number Number and Divisor : ");
        int n = sc.nextInt();
        int divisor = sc.nextInt();
        findQuoQuotientAndRemainder(n, divisor);
    }

    private static void findQuoQuotientAndRemainder(float n, float divisor) {

        if (divisor == 0) {
            System.out.println("Divisor cant be Zero");
            return;
        }
        float quotient = n / divisor;
        float remainder = n % divisor;

        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);


    }
}
