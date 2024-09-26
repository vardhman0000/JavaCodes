package TwoDArray;
import java.util.*;

public class Rotate90Clockwise {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter m : ");
        int m = inp.nextInt();
        System.out.print("Enter n : ");
        int n = inp.nextInt();

        int [][] arr = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = inp.nextInt();
            }
        }

        System.out.println("Before Rotation");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
