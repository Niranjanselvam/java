//19 Basic Operations Write a Java Program to find the greatest of three numbers.
import java.util.Scanner;
public class op19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int greatest;

        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }
        System.out.println("Greatest number = " + greatest);
    }
}
