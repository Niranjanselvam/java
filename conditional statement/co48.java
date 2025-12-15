//Q9.Write a java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).
import java.util.Scanner;

class co48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int amount = sc.nextInt();

        if (amount <= balance && amount % 100 == 0)
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Invalid Withdrawal");
    }
}
