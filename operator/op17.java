
import java.util.Scanner;

public class op17
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     boolean b=(a&(a-1))==0 ? true:false;
     System.err.println(b);


 }   
}