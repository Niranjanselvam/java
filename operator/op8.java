// 8 Basic Operations Write a Java Program to print the last digit of a given number N.

import java.util.Scanner;
public class op8
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        System.out.println(b);

    }
}