//Q10. Write a Java Program to print the given octal number in integer format.
import java.util.Scanner;

public class int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octal = sc.next();               
        int value = Integer.parseInt(octal, 8); 

        System.out.println("int: " + value);
    }
} 