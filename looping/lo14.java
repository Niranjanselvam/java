
import java.util.Scanner;

//Q14. Write a Java program to check whether a given number is a Strong Number or not.
public class lo14
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int big;
       int gcd=1;
       int lcm;
       if(a>b)
       {
        big=a;
       }
       else{
        big=b;
       }
       for(int i=1;i<=big;i++)
       {
        if(a%i==0&&b%i==0)
        {
            gcd=i;
        }
       }
        lcm=(a*b)/gcd;
       System.out.println("lcm");
    }
}