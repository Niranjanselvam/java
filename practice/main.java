import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int a=0;
        while(temp!=0)
        {
            a++;
            temp/=10;
        }
        int c=0;
        int b=n;
        do
        { 
            int rem=b%10;
            c+=Math.pow(rem,a);
            b/=10;
        } while (b!=0);
        if(n==c)
        {
            System.out.println("It is a Amstrong");
        }
        else
        {
            System.out.println("It is not an Amstrong");
        }
    }
}