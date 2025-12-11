// 7 Basic Operations Write a Java Program to swap two numbers without using a third variable.\
import java.util.Scanner;
public class op7
{
 public static void main(String [] args)
 {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println(a+","+b);
 }
}
