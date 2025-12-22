//Q21. Print roll number and name

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        sc.nextLine(); 
        String name = sc.nextLine();
        System.out.println("Roll No: " + roll + ", Name: " + name);
    }
} 