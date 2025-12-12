import java.util.Scanner;
public class co5
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            if(a%3==0)
            {
                System.err.println("even and multiple of 3");
            }
            else{
                System.err.println("even and not muliple of 3");
            }
        }
        else{
            System.err.println("its odd and multiple of 3");
        }
    }
}