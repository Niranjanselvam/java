
import java.util.Scanner;

//1 Scenario Based Q1.Write a java Program to print Price After Discount
public class op36
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double bill=sc.nextDouble();
    double discount;
    if(bill<1000)
    {
        discount=bill*0.05;
        }
    else if(bill>=1000&&bill<=5000)
    {
        discount=bill*0.10;
        }
        else
    {
        discount=bill*0.15;
        }
     double finalprize=bill-discount;
     System.out.println(finalprize);
     }
}