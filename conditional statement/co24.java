
import java.util.Scanner;

//19 Number Based Write a Java Program to check whether the product of two numbers is positive or negative.
public class co24
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        if(c>0)
        {
            System.out.println("postive");
        }
        else{
            System.out.println("negative");
        }

    }
}