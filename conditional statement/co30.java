//5 Character Based Write a Java Program to check whether two characters are equal or not.
import java.util.Scanner;

public class co30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        if (ch1 == ch2) {
            System.out.println("equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}
