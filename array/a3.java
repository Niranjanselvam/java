import java.util.Scanner;
public class a3{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int sum=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
            System.out.println("the sum is "+sum);
        }
    }
}git config --global user.name "Your Name"
git config --global user.email "your@email.com"
