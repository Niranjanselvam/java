//Q11.Write a java Program to calculate selling price given cost price and profit.
import java.util.Scanner;
public class op45{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int costprice=sc.nextInt();
        int profit=sc.nextInt();
        int sellingprice=costprice+profit;
        System.out.println(sellingprice);

    }
}