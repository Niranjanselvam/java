// return type with arguments
/* returnType methodName(dataType parameter1, dataType parameter2, ...) {
    // method body
    return value;
} */


/* import java.util.Scanner;

class m1 {

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);  // method call with argument
        System.out.println("Factorial of " + num + " is: " + result);
    }
} */
// return type without arguments
/* returnType methodName() {
    // method body
    return value;
} */
/* import java.util.Scanner;

class m1 {

    static int num;   // class-level variable

    // Method with return type and NO arguments
    static int factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int result = factorial();   
        System.out.println("Factorial of " + num + " is: " + result);
    }
} */
// without return type with arguments
/* void methodName(dataType parameter1, dataType parameter2, ...) {
    // method body
} */
import java.util.Scanner;

class m1 {

    // Method WITHOUT return type (void) & WITH argument
    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        factorial(num);   // method call with argument
    }
}




