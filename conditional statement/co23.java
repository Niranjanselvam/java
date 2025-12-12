
import java.util.Scanner;

//18 Number Based Write a Java Program to check whether a number is a single-digit, two-digit, or three-digit number.
public class co23
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a<10)&&(a>-0))
        {
            System.out.println("single");
        }
        else if((a<100)&&(a>=10))
        {
            System.out.println("double");
        }
        else if((a<1000)&&(a>=100))
        {
            System.out.println("triple");
        }
        else
        {
            System.out.println("more than 3");
        }

    }
}