package Array;

import java.util.Arrays;

public class MaxAppear {
    public static void main(String[] args) {
        int[] l = {1,2,4};
        int[] r = {4,5,7};
        System.out.println(MaxmiumAppearing(l,r,l.length));
        }
    static int MaxmiumAppearing(int[] left, int[] right,int n){
        int[] freq = new int[100];
        for(int i = 0;i<n;i++ ){
            freq[left[i]] = 1;
            freq[right[i]]  = 1;
        }
        for(int i = 1;i<100;i++){
            freq[i] += freq[i-1];
        }
        System.out.println(Arrays.toString(freq));
        return 0;
    }
}

