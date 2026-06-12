package Day_6_Practice_Problem.JUnit_Testing;

import java.util.Scanner;

public class MonthlyPayment {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal loan amount (P) : ");
        long P = sc.nextLong();
        System.out.print("Enter years to pay (Y) : ");
        long Y = sc.nextLong();
        System.out.print("Enter annual interest rate (in %) (R) : ");
        long R = sc.nextLong();
        double resultAmt = calculateMonthlyPayment(P, Y, R);
        System.out.println("The amount per month is " + resultAmt);
    }

    private static double calculateMonthlyPayment(long P, long Y, long R) {
        double n = 12 * Y;
        double r = (double) R / (12 * 100);
        return (P * r) /(1-Math.pow(1+r,-n));
    }
}
