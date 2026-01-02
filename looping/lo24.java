import java.util.Scanner;
public class lo24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);    //perfect number =sum of all factors = num
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            sum+=i;
        }
        if(sum==a&&a!=0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO");
        }

    }
}