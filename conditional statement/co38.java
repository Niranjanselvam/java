//Write a Java Program to check whether the given day number (1–7) is a weekday or weekend.
import java.util.Scanner;
public class co38
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        if(days>=1&&days<=7)
        {
            System.out.println("Weekday");
        }
        else
        {
            System.out.println("weekend");
        }
    }
}