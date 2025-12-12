//15 Number Based Write a Java Program to check whether a number is divisible by either 3 or 7.
import java.util.Scanner;
public class co20
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if((a%3==0)||(a%7==0))
        {
            System.out.println("divisible");
        }
        else{
            System.out.println("no");
        }
    }
}