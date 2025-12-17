
import java.util.Scanner;

//Q17. Write a Java program to check whether a given number is a Harshad Number or not.
public class lo16
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int o=a;
        int res=0;
        while(a>0)
        {                                                       //10 =1+0=1
                                                                1%1==0
            int r=a%10;
            res+=r;
            a=a/10;
        }
        if(o%res==0)
        {
            System.out.println("harshad");
        }
        else{
            System.out.println("no");
        }

    }
}