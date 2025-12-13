//12 Number Based Write a Java Program to check whether the last digit of a number is odd or even.
import java.util.Scanner;
public class co12
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        if(b%10==0)
        {
            System.err.println("Even");
        }
        else{
            System.err.println("Odd");
        }

    }
}