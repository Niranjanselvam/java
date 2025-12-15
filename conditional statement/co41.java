
import java.util.Scanner;

public class co41
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=0&&a<=50)
        {
            System.out.println(a-15);
        }
        else if(a>50&&a<=60)
        {
            System.out.println(a-30);
            
        }
        else if(a>60&&a<=70)
        {
            System.out.println(a-35);
        }
        else if(a>70&&a<=75)
        {
            System.out.println(a-40);
        }
        else if(a>75&&a<=80)
        {
            System.out.println(a-45);
        }
        else
        {
            System.out.println(a-50);
        }

    }
}