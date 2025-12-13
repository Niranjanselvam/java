import java.util.Scanner;
public class co49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = sc.nextInt();
        int price = sc.nextInt();
        int free = (pens / 5) * 2;
        System.out.println((pens - free) * price);
    }
}
