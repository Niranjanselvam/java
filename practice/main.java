import java.util.Scanner;
public class main
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int o=a;
        int n=0;
        while(o!=0)
        {
            a++;
            o=o/10;
        }
        int c=0;
        int b=n;
        while(b!=0)
        {
            int rem=b%10;
            c+=Math.pow(rem,a);
            b=b/10;
        }
        if(n==c)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }


    }
}