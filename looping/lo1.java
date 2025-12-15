//Q1. Write a Java program to print the factorial of a given number N.
import java.util.Scanner;

public class lo1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
             fact *=i;
        }
            System.out.println(fact);

    }
}