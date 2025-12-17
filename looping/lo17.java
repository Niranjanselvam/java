
import java.util.Scanner;

//Q18. Write a Java program to check whether a given number is a Buzz Number or not.
public class lo17
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();                      //a%10==7||a%7==0
        if(a%7==0||a%10==7)
        {
            System.out.println("buzz number : "+a);
        }
        else{
            System.out.println("no");
        }
    }
}