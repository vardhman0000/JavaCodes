package Questions;

public class Cut_Chocolate {
    static int findRem(int h, int[] arr){
        int sum = 0;
        for(int x : arr){
            if(x-h > 0){
                sum+= (x-h);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {15, 20, 8, 17};
        int n = 4 ;
        int k = 7;

        int max = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        int low = 0;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(findRem(mid, arr) >= k){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
