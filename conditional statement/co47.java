//Q7.Write a java program to calculate electricity bill using slab rates (0–100 free, 101–300 = ₹5/unit, >300 = ₹10/unit) and apply surcharge if consumption exceeds 500 units.
import java.util.Scanner;

class co47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill = 0;

        if (units <= 100)
            bill = 0;
        else if (units <= 300)
            bill = (units - 100) * 5;
        else
            bill = (200 * 5) + (units - 300) * 10;

        if (units > 500)
            bill += 100; // surcharge

        System.out.println("Electricity Bill: ₹" + bill);
    }
}
