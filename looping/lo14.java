
import java.util.Scanner;

//Q14. Write a Java program to check whether a given number is a Strong Number or not.
public class lo14
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int o=a;
        int sum=0;
        while(a>0)
        {
            int r=a%10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {                             //num=145
                                           //1!+4!+5! =1+24+120=145 145==145

                fact*=i;
            }
            sum+=fact;
            a=a/10;
            }
            if(sum==o)
            {
                System.out.println("Strong number");
            }
            else
            {
                System.out.println("no");
            }
    }
}