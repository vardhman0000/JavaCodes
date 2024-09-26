package TwoDArray;

import java.util.Scanner;

public class Sherlock {
    //  x -> konsa row/col
    static void handleRow (int x, int arr[][], int n){
        for(int i=0; i<n; i++){
            arr[x][i]++;
        }
    }
    static void handleCol (int x, int arr[][], int m){
        for(int i=0; i<m; i++){
            arr[i][x]++;
        }
    }
    static void printArr (int m, int n, int arr [][]){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int countOdd(int arr[][], int m, int n, int count){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter value of m : ");
        int m =sc.nextInt();
        System.out.print("Enter value of n : ");
        int n =sc.nextInt();

        int [][] arr = new int[m][n];

        for(int i=0; i<m; i++){ // matrix initialise hogyi
            for(int j=0; j<n; j++){
                arr[i][j] = 0;
            }
        }
        System.out.println("Matrix initialised Successfully!!");

        System.out.print("Enter no. of Queries : ");
        int q = sc.nextInt();

        int [][] query = new int [q][2];

        for(int i=0; i<q; i++){
            System.out.println("Query No. : " + (i+1));
            for(int j=0; j<2; j++){
                query[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Query Matrix : ");
        printArr(q, 2, query);

        // Implementing Queries
        for(int i=0; i<q; i++){
            System.out.println("Implementing Query " + (i+1));
//            for(int j=0; j<2; j++){
                if(query[i][0] == 0){
                    System.out.println("ROW");
                    handleRow(query[i][1], arr, n);
                    printArr(m,n,arr);
                }
                else {
                    System.out.println("COL");
                    handleCol(query[i][1], arr, m);
                    printArr(m,n,arr);
                }
//            }
        }


        System.out.println("Final Matrix : ");
        printArr(2,2,arr);


        int count = 0;
        count = countOdd(arr, m, n, count);
        System.out.println("Total Odd elements : " + count);

    }


    //  type = 0 --> index = ROW (i)   type = 1 ---> index = konsi ROW (j)
    //      |         |
    //     type    index
    //      j=0    j=1
    // i=0   0      1     Row -> 1st Row
    // i=1   0      0     Row -> 0th Row
    // i=2   0      0     Row -> 0th Row
    // i=3   1      1     Col -> 1st Col


    // RESULT
    //         COL
    // ROW ->  2  3
    // ROW ->  1  2





}
