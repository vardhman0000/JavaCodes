package Patterns;

import java.util.Scanner;

public class Spiral {

    static void printArr(int[][]arr, int m) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiral(int [][] arr, int m) {
        int top = 0 ;
        int bottom = m-1;
        int left = 0;
        int right = m-1;

        while(left <= right && top <= bottom) {


            // Top
            int trow = left;
            while (trow <= right) {
                System.out.print(arr[top][trow] + " ");
                trow++;
            }
            top++;
//            System.out.println("Updated Top : " + top);


            // Right
            int rcol = top;
            while (rcol <= bottom) {

                System.out.print(arr[rcol][right] + " ");
                rcol++;
            }
            right--;
//            System.out.println("Updated Right : " + right);


            // Bottom
            int brow = right;
            while (brow >= left) {
                System.out.print(arr[bottom][brow] + " ");
                brow--;
            }
            bottom--;
//            System.out.println("Updated Bottom : " + bottom);


            // Left
            int lcol = bottom;
            while (lcol >= top) {

                System.out.print(arr[lcol][left] + " ");
                lcol--;
            }
            left++;
//            System.out.println("Updated Left : " + left);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dimension of Matrix : ");
        int m = input.nextInt();

        int [][] arr = new int [m][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter Number at " + i + " " + j + " : ");
                arr[i][j] = input.nextInt();
            }
        }

        printArr(arr, m);

        spiral(arr, m);

    }
}
