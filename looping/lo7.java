
import java.util.Scanner;

//Q7. Write a Java program to check whether a number is Armstrong number or not.
public class lo7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int sum=0;
        while(a>0)
        {
            int n=a%10;
            sum+=n*n*n;
            a=a/10;
            
        }
        if(sum==t)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("Not an armstrong");
        }
    }
}