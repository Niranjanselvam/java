//3 Character Based Write a Java Program to check whether a character is alphabet or not.

import java.util.Scanner;

public class co28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet.");
        } else {
            System.out.println("NOT an Alphabet.");
        }
    }
}
