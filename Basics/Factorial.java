package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
        int n1 = n;
        while(n > 0){
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of " + n1 + " is " + fact);
    }
}
