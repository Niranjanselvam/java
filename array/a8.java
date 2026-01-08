import java.util.Scanner;
public class a8
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
        int index=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i]; 
            }
            while(index<a)
            {
                arr[index]=0
            }
        }
    }
}