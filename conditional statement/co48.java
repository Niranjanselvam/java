import java.util.Scanner;
public class co48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoes = sc.nextInt();
        int price = sc.nextInt();
        int free = mangoes / 4;
        System.out.println((mangoes - free) * price);
    }
}
