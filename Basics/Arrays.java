package Basics;
import java.util.Scanner;
// hello world
//public class Arrays {
//    public static void main(String[] args){
//        int [] marks = new int [5];
//        marks[0] = 100;
//        marks[1] = 200;
//        marks[2] = 300;
//        marks[3] = 400;
//        marks[4] = 500;
//
//        // enhanced for loop
//        for (int i : marks) {
//            System.out.println(i);
//        }
//    }
//}

class Arrays{
    public static void main(String[] args) {
        int [][] arr = new int [2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int i=0; i<2; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        for (int[] ele : arr){
            for(int i : ele){
                System.out.println(i);
            }
        }


        float [] arr2 = new float [5];
        Scanner inp = new Scanner(System.in);

        int n = 5;
        for(int i=0; i<n; i++){
            System.out.print("Enter a number at index "+i+" : ");
            arr2[i] = inp.nextFloat();
        }

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }


        // Create an array of 6 floats and calculate their sum
        float sum = 0;
        for (float i : arr2){
            sum+=i;
        }
        System.out.println("Sum of Float Array : " + sum);

        // WAP to find out whether a given integer is present in an array or not
        System.out.print("Enter Integer : ");
        int n1 = inp.nextInt();
        int [] arr3 = new int[5];
        arr3[0] = 1;
        arr3[1] = 4;
        arr3[2] = 5;
        arr3[3] = 6;
        arr3[4] = 8;
        boolean flag = false;
        for(int i=0; i<arr3.length; i++){
            if(arr3[i] == n1) {
                flag = true;
            }
        }

        if(flag){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

    }
}
