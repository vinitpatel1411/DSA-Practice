package Arrays.Easy;

public class LongestSubArraySum {
    int longestSubArray(int arr[], int k){
        int n = arr.length;
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int sum = arr[0];
        while(j<n){
            while(sum>k && i<=j){
                sum -= arr[i];
                i++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, j-i+1);   
            }
            j++;
            if(j<n){
                sum += arr[j];
            }
        }
        return maxLen;   
    }  
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        LongestSubArraySum obj = new LongestSubArraySum();
        int ans = obj.longestSubArray(nums, k);

        // Output the result
        System.out.println("The length of longest subarray having sum k is: " + ans);
    } 
}
