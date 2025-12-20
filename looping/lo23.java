import java.util.Scanner;
public class lo23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);                  //abundant number=sum of the proper divisor-number(input)
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        if(sum>a)
        {
            System.out.println("Abundant number");
        }
        else
        {
            System.out.println("no");
        }

    }
}