//Write a Java Program to check grade of a student based on marks (A, B, C, Fail).
import java.util.Scanner;
public class co37
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=0&&a<=30)
        {
            System.out.println("fail");
        }
        else if(a>30&&a<=60)
        {
            System.out.println("C");
        }
        else if(a>60&&a<=80)
        {
            System.out.println("B");
        }
        else 
        {
            System.out.println("A");
        }
        
    }
}