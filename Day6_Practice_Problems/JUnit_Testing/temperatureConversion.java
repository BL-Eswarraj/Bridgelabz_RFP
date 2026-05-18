package Day_6_Practice_Problem.JUnit_Testing;

import java.util.Scanner;

public class temperatureConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temp : ");
        double temp = sc.nextDouble();
        System.out.print("Choose Option : ");
        System.out.print("\n  1.Celsius to Fahrenheit ");
        System.out.print("\n  2.Fahrenheit to Celsius \n");
        int chose = sc.nextInt();
        if (chose == 1) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println("Celsius is " + fahrenheit + " °F");
        } else if (chose == 2) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println("Celsius is " + celsius + " °C");

        } else {
            System.out.println("Enter correct option......");
        }
    }

    private static double fahrenheitToCelsius(double temp) {
        return (temp - 32.0) * 5.0 / 9.0;
    }

    private static double celsiusToFahrenheit(double temp) {
        return (temp * 9.0 / 5.0) + 32.0;
    }
}
