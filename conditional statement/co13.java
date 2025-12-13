
import java.util.Scanner;

//13 Number Based Write a Java Program to check whether a number is positive, negative, or zero.
public class co13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0)
        {
            System.err.println("Positive");
        }
        else if(a<0)
        {
            System.err.println("Negative");
        }
        else
        {
            System.err.println("zero");
        }
    }
}