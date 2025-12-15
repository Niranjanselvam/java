//Q11.Write a java program to apply % of discount based on purchase amount.
import java.util.Scanner;

class co50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount >= 5000)
            System.out.println("20% Discount");
        else if (amount >= 3000)
            System.out.println("10% Discount");
        else
            System.out.println("No Discount");
    }
}
