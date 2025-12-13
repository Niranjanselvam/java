//18 Basic Operations Write a Java Program to check whether a number is positive or negative.
import java.util.Scanner;
public class op18
{
    public static void main(String [] args)
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     String r=(a>0)?"positive":"negative";
     System.out.println(r);
    }

}