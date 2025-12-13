//Q14.Write a java Program to Pens Discount (Buy 5, Pay for 3) Find Total Amount need to pay
// Q14. Write a Java Program to Pens Discount (Buy 5, Pay for 3)
import java.util.Scanner;

public class op48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPens = sc.nextInt();      
        int pricePerPen = sc.nextInt();    

        int offerSets = totalPens / 5;
        int freePens = offerSets * 2;
        int payPens = totalPens - freePens;

        int totalAmount = payPens * pricePerPen;
        System.out.println(totalAmount);
    }
}
