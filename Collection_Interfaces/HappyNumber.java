package Collection_Interfaces;

public class HappyNumber {
    static int square(int num){
        return num*num;
    }

    static boolean isHappy(int n)
    {
        // Write your code here
        int sum = 0 ;
        while(n >= 10){ // n = 12
            sum = 0 ;
            while(n > 0){ // T  // T
                int digit = n%10; // 2  1
                sum += square(digit); // 4  5
                n = n/10 ; // n=1  n=0 -> False
            }
            n = sum;
        }
        if(sum == 1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(isHappy(num));
    }
}
