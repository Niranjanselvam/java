//Write a Java Program to check whether two given years have the same last digit.
import java.util.Scanner;
public class co34{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d){
            System.out.println("the last digit of 2years are same ");
        }
        else{
            System.out.println("the last digit of 2years are  not same ");
        }
    }
}