//4 Character Based Write a Java Program to check whether a character is a digit or not.
import java.util.Scanner;

public class co29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit.");
        } else {
            System.out.println("NOT a Digit.");
        }
    }
}
