import java.util.Scanner;

public class Address {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         String line1 = sc.nextLine();
         String city = sc.nextLine();
         String state = sc.nextLine();
         String country = sc.nextLine();
         System.out.println("\nYour Address:\n" + name + "\n" + line1 + "\n" + city + ", " + state + "\n" + country);
    }
}
