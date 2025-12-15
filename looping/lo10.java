
import java.util.Scanner;

//Q10. Write a Java program to check whether a given number is prime or not.
public class lo10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1)
        {
            isprime=false;
        }
        else{
            for(int i=2;i<=n/2;i++)
            {
                if(n%2==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }

    }
}