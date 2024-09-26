package Patterns;

import java.util.Scanner;

public class Zero_One {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter a Limit : ");
        int num = scan.nextInt();

        int n = 0 ;

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                if((i+j) % 2 == 0){ // EVEN
                    System.out.print(0 + " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
