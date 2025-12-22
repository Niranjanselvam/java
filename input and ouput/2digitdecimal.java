// Write a Java Program to print the given fractional number in 2-digit decimal format.
 import java.util.Scanner;
public class 2digitdecimal
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.printf("%.2f",a);
    }
} 