package Day_6_Practice_Problem.JUnit_Testing;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date : ");
        int date = sc.nextInt();
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        int day = getDayOfWeek(date, month, year);
        switch (day) {
            case 0:
                System.out.println("It is Sunday");
                break;
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
        }
    }

    private static int getDayOfWeek(int date, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (date + x + (31 * m0) / 12) % 7;
    }
}
