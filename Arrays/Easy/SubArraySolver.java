package Arrays.Easy;

import java.util.HashMap;

public class SubArraySolver {
    int getLongestSubArray(int arr[], int k){
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k)
                maxLen = i + 1;
            if(sum<k){
                int rem = k - sum;
                if(map.containsKey(rem)){
                    int len = i - map.get(rem);
                    maxLen = Math.max(maxLen, len);
                }
            }
            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;

        SubArraySolver obj = new SubArraySolver();
        int len = obj.getLongestSubArray(a, k);

        System.out.println("The length of the longest subarray is: " + len);
    }
}
