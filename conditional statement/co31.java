// Write a Java Program to check whether a year is a leap year or not.
import java.util.Scanner;

public class co31
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int var2 = sc.nextInt();
      if (var2 % 4 ==0 &&(var2%100!=0) || var2 % 400 == 0) 
      {
         System.out.println("it is leap year");
      } 
      else 
      {
         System.out.println("it is not a leap year");
      }

    }
   
}