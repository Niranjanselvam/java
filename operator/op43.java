//Q8.Write a java Program to Calculate Total Cakes Made based on no.of trays and no.of cakes for each tray
import java.util.Scanner;

public class op43
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int trays=sc.nextInt();
        int noofcakes=sc.nextInt();
        int cakes=trays*noofcakes;
        System.out.println(cakes);
    }

}