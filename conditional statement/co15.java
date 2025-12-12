
import java.util.Scanner;

//10 Number Based Write a Java Program to check whether the sum of two numbers is even or odd.
public class co15
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=a+b;
     if(c%2==0)
     {
        System.err.println("even");
     }
     else{
        System.err.println("Odd");
     }

 }   
}