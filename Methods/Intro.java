package Methods;

public class Intro {
    public static int multiply(int a, int b){
        int x = a*b;
        return x;
    }
    public static int multiply(int a, int b, int c){
        int x = a*b*c;
        return x;
    }
    public static int fact(int num){
        int ans = 1 ;
        while(num>=1){
            ans = ans * num;
            num--;
        }
        return ans;
    }
    public static int ncr(int n,int r){
        int ans = 1 ;
        ans = fact(n)/( fact(r) * ( fact(n-r)) );
        return ans;
    }
    public static boolean prime(int num){
        boolean ans = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                ans = false;
                break;
            }

        }
        return ans;

    }

    public static void main(String[] args) {

        int ans = multiply(9,9);
        System.out.println(ans);

        int ans2 = multiply(9,9, 9);
        System.out.println(ans2);

        int ans3 = fact(5);
        System.out.println("Factorial is " + ans3);

        int ans4 = ncr(4,2);
        System.out.println("NCR : " + ans4);

        boolean ans5 = prime(2);
        System.out.println(ans5);

    }
}
