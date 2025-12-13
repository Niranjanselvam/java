
import java.util.Scanner;

//8 Number Based Write a Java Program to check whether the last digit of a number is divisible by 3.
public class co8
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a/3)*3==a)                       //if((a/2)*2==a)

        {
            System.err.println("divisible by 3");
        }
        else{
            System.err.println("no");
        }
    }
}