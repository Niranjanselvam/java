// Display first 10 terms: 10, 20, 30, 40, …
import java.util.Scanner;
    public class s1 
    {
    public static void main(String[] args) {                //10,20,30,40,50,60,70,80,90,100.

        for (int i = 10; i <=100; i += 10) {
            if(i<100){
            System.out.print(i + ",");
            }
        else{
        System.out.print(i+"."); 
        }
        }
    }
}

