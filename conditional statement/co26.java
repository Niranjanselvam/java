//Write a Java Program to check whether a triangle is equilateral, isosceles, or scalene.
import java.util.Scanner;

public class co26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("equilateral");
        }
        
        else if(a==b||b==c||a==c)
        {

            System.out.println("isosceles triangle");
        }
        else
        {
            System.out.println("scalene triangle");
        }
    }
}
