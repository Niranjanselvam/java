
import java.util.Scanner;

//Q12.Write a java Program to calculate cost price given selling price and loss.
public class op46
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sellingprice=sc.nextInt();
        int loss=sc.nextInt();
        int costprice=sellingprice-loss;
        System.out.println(costprice);
    }
}