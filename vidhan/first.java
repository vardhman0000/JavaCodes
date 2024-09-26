package vidhan;
import java.util.*;
public class first {

    static void powerOfTwo(int n) {
        if(((n) & (n-1)) == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    static void swapNumbers(int n, int m) {

    }

    public static void main(String[] args) {

//        int a;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        int i = 2;
//        a = a >> i;
//        a = a << i; // clear ith bit
//        System.out.println(a);

        powerOfTwo(4);
    }
}
