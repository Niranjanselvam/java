//Q1.Write a java Program to print Price After Discount
import java.util.Scanner;
public class co36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int discount = sc.nextInt(); 
        int finalPrice = price - (price * discount / 100);
        System.out.println(finalPrice);
    }
}
