    // 10 Basic Operations Write a Java Program to print the sum of the first and last digit of a 3-digit number.
import java.util.Scanner;
public class op10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        int c=a/100;
        System.out.println(b+c);

    }
}