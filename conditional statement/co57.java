//Q18.Write a java program to calculate water bill using slab rates (≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).
import java.util.Scanner;

class co56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        int bill = 0;

        if (liters <= 1000)
            bill = 0;
        else if (liters <= 3000)
            bill = ((liters - 1000) / 1000) * 5;
        else
            bill = (2 * 5) + ((liters - 3000) / 1000) * 10;

        System.out.println("Water Bill: ₹" + bill);
    }
}
