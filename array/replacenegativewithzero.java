import java.util.Scanner;
public class replacenegativewithzero
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]<0)
            {
                arr[i]=0;
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]);
        }
    }
}