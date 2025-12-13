// 6 Basic Operations Write a Java Program to swap two numbers using a third variable.
import java.util.Scanner;
public class op6
{
 public static void main(String [] args)
 {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=a;
     a=b;
     b=c;
     System.out.println(a+","+b);
 }
}