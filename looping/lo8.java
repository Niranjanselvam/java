
import java.util.Scanner;

public class lo8
{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int gcd=1;
         int small;
         if(a>b)
         {
            small=a;
         }
         else
         {
            small=b;
         }
         for(int i=1;i<=small;i++)
         {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
         }
         int lcm=(a*b)/gcd;
         System.out.println(gcd);
         System.out.println(lcm);
    }
}