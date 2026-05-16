package Day_5_Practice_Problem;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character ch : ");
        String ch = sc.nextLine();
        String value = ch.trim().toLowerCase();
        if (value.equals("a") || value.equals("e") || value.equals("i")
                || value.equals("o") || value.equals("u")) {
            System.out.println("The Character " + ch + " is Vowel");
        } else {
            System.out.println("The Character " + ch + " is Consonant");
        }
    }

}
