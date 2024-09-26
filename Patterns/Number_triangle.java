package Patterns;

import java.util.Scanner;

public class Number_triangle {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter a Limit : ");
        int num = scan.nextInt();

        int x = 1;

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}
