//Write a Java Program to check whether a given year is a century year or not.
import java.util.Scanner;
public class co32{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%100==0){
            System.out.println("it is century year");
        }
        else{
            System.out.println("it is not a century year");
        }
    }
}