
import java.util.Scanner;

//Q13.Write a java Program to Mangoes Discount (Buy 3 Get 1 Free) Find Total Amount need to pay
public class op47{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalmangoes=sc.nextInt();
        int pricepermango=sc.nextInt();
        int freemangoes=totalmangoes/4;
        int paymangoes=totalmangoes-freemangoes;
        int price=paymangoes*pricepermango;
        System.out.println(price);
    }
}