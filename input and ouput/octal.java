//Q8. Write a Java Program to print the given integer number in octal format.
import java.util.Scanner;
public class octal{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         System.out.println("octal: " + Integer.toOctalString(a));
    }
    
} 
