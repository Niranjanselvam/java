
import java.util.Scanner;

//14 Number Based Write a Java Program to check whether a number is divisible by both 3 and 5.
public class co19
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%3==0)&&(a%5==0))
        {
            System.out.println("divisible");
        }
        else{
            System.out.println("no");
        }
    }
}