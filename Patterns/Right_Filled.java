package Patterns;

/*
_ _ _ _ *
_ _ _ * *
_ _ * * *     STARS -> i+1   BLANKS -> n-i-1
_ * * * *
* * * * *
*/

import java.util.Scanner;

public class Right_Filled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i < n-i-1){
                    System.out.print("_ ");
                }
                if(j < i+1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
