
import java.util.Scanner;

//1 Scenario Based Q1.Write a java Program to print Price After Discount
public class op36
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int oprice=sc.nextInt();
    int discount=sc.nextInt(); 
    int discountamt=(oprice*discount)/100;
     int finalprize=oprice-discountamt;
     System.out.println(finalprize);
     }
}