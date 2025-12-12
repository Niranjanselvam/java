//6 Scenario Based Q6.Write a java Program to Convert Bytes to bits
//8bytes=1bits
import java.util.Scanner;
public class op41
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bytes=sc.nextInt();
        int bits=8*bytes;
        System.out.println(bits);

    }
}