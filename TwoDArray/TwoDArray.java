package TwoDArray;

import java.util.Scanner;

public class TwoDArray {

    static void diagonalSum(int m, int n, int arr[][]){
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == j || j == n-i-1) {
                    sum += arr[i][j];
                }

            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        diagonalSum(m,n,arr);

    }
}
