
import java.util.Scanner;

//Q9. Write a Java program to find the GCD of two numbers.
public class lo9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;
        int big;
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
        System.out.println("gcd : "+gcd);
    }
}