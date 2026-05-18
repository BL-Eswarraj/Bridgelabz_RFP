package Day_6_Practice_Problem.JUnit_Testing;

import java.util.Scanner;

public class SqrtUsingNewtonMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double num = sc.nextInt();
        double result = squrt(num);
        System.out.println("The Square root of the number " + num + " is " + result);
    }

    public static double squrt(double num) {
        if (num < 0) {
            System.out.println("Input must be non negative");
            return Double.NaN;
        }
        double epsilon = 1e-15;
        double t = num;
        while (Math.abs(t - num / t) > epsilon * t) {
            t = (t + num / t) / 2.0;
        }
        return t;
    }
}
