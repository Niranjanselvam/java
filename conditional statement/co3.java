//3 Number Based Write a Java Program to check odd or even.
import java.util.Scanner;
public class co3
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.err.println("even");
        }
        else{
            System.err.println("Odd");
        }
    }
}