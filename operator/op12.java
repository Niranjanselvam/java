//12 Basic Operations Write a Java Program to print the absolute value of a number.
import java.util.Scanner;
public class op12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a);
        System.out.println(b);
    }
}