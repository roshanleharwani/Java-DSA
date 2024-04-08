package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(find(25));
    }
    static int find(int x){
        int low = 0, high = x, ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int msq = mid*mid;
            if(msq==x){
                return mid;
            }
            else if(msq>x){
                high = mid-1;
            }
            else{
                low= mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
