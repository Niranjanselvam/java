//Q7. Write a Java program to check whether a number is Armstrong number or not.
import java.util.Scanner;
public class lo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int o=n;
        int a=0;
        while(o!=0)
        {
            a++;
            o/=10;
        }
        int c=0;
        int b=n;
    
        while(b!=0)
        { 
            int rem=b%10;
            c+=Math.pow(rem,a);
            b/=10;
        } 
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