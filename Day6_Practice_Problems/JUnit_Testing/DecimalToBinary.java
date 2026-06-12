package Day_6_Practice_Problem.JUnit_Testing;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int decimal = sc.nextInt();
        StringBuilder stringBuilder = convertDecimalToBinary(decimal);
        System.out.println(stringBuilder.toString());
    }

    public static StringBuilder convertDecimalToBinary(int num) {
        int totalbits = 16;
        StringBuilder str = new StringBuilder();
        for (int i = totalbits - 1; i >= 0; i--) {
            int power = 1 << i;
            if (num >= power) {
                str.append("1");
                num -= power;
            } else {
                str.append("0");

            }
        }
        return str;
    }
}
