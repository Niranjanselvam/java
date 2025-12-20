import java.util.Scanner;
public class lo22
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int o=a;
        int sum=0;
        int pro=1;                                   //spynumber
        while(a>0)
        {
            int r=a%10;
            sum=sum+r;
            pro=pro*r;
            a=a/10;       
        }
        if(sum==pro)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}