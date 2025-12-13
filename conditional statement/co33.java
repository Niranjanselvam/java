//Write a Java Program to check whether the first two digits and last two digits of a year are equal.
import java.util.Scanner;
public class co33{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%100;
        int c=a/100;
        if(b==c){
            System.out.println("the first 2 digit and last 2 digit of a number is same");
        }
        else{
            System.out.println("it is not same");
        }
    }
}