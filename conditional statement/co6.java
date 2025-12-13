
import java.util.Scanner;

//5 Number Based Write a Java Program to check whether a number is a 3-digit number or not.
public class co6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a>=100&&a<=999)||(a<=-100&&a>=-999))
        {
            System.out.println("3 digit");
        }
        else
        {
            System.out.println("no");
        }
    }
}