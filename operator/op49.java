//Q15.Write a java Program to Currency Notes from ATM
// Q15. Write a Java Program to Currency Notes from ATM
import java.util.Scanner;

public class op49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        int n2000 = amount / 2000;
        amount = amount % 2000;

        int n500 = amount / 500;
        amount = amount % 500;

        int n200 = amount / 200;
        amount = amount % 200;

        int n100 = amount / 100;
        amount = amount % 100;

        int n50 = amount / 50;
        amount = amount % 50;

        int n20 = amount / 20;
        amount = amount % 20;

        int n10 = amount / 10;

        System.out.println("2000 : " + n2000);
        System.out.println("500  : " + n500);
        System.out.println("200  : " + n200);
        System.out.println("100  : " + n100);
        System.out.println("50   : " + n50);
        System.out.println("20   : " + n20);
        System.out.println("10   : " + n10);
    }
}
