
import java.util.Scanner;

//Q16. Write a Java program to check whether a given number is a Neon Number or not.
public class lo15
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int o=a;
        int r=a*a;
        int sum=0;
        while(r>0)                   //num=9
        {                            // 9^2=81; 8+1 =9 9==9
            int s=r%10;
            sum+=s;
            r=r/10;
        }
        if(sum==o)
        {
            System.out.println("neon number");
        }
        else{
            System.out.println("no");
        }
    }
}