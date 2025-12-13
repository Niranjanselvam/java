
import java.util.Scanner;

//11 Number Based Write a Java Program to check whether the first digit of a 3-digit number is odd or even.
public class co11
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/100;
        if(b%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}