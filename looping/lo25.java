import java.util.Scanner;

public class lo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // fibonacci series  0+1 
                                                // 0 1 1 2 3 5 8 15
        
        int a = 0, b = 1; 
                                                         // 3 5 8
        for (int i = 0; i < n; i++) {
            int range=sc.nextInt();
            for(int j=1;j<=range;i++)
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
