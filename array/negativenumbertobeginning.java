import java.util.Scanner;
public class negativenumbertobeginning
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int index=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]<0)
            {
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
           
    }
}