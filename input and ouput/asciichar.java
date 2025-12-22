//Q11. Write a Java Program to print the ASCII value of a character.
import java.util.Scanner;

public class asciichar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
         ch = sc.next().charAt(0);   

        int ascii = (int) ch;            

        System.out.println("ASCII value: " + ascii);
    } 
}