//Q8. Write a Java program to find the LCM of two numbers.
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
            small=b;
         }
         else
         {
            small=a;
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



/* import java.util.Scanner;

//Q9. Write a Java program to find the GCD of two numbers.
public class lo9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
} */