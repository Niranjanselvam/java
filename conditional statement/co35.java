// Program to check valid year-month and print number of days
import java.util.Scanner;

public class co35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();   // Year
        int month = sc.nextInt();  // Month (1-12)
        if (month < 1 || month > 12 || year <= 0) {
            System.out.println("Invalid Year or Month");
        } else {
            int days;
            boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

            if (month == 2) {
                days = leap ? 29 : 28;
            } 
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } 
            else {
                days = 31;
            }

            System.out.println(days);
        }
    }
}
