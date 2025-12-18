
import java.util.Scanner;

//Q14. Write a Java program to check whether a given number is a Strong Number or not.
public class lo14
{
    public static void main(String[] args) 
    {                                                   //145=1!+4!+5! = 1+24+120=145

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int o=n;
        while(o>0)
        {
            int fact=1;
            int digit=o%10;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            o=o/10;
        }
        if(sum==n)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }

    }
}