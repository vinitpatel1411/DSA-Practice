package Arrays.Easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        SolutionRemoveDuplicate obj = new SolutionRemoveDuplicate();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = obj.RemoveDuplicate(nums);
        System.out.println("After Removing Duplicate");
        for(int i=0;i<k;i++){
            System.out.println(nums[i]);
        }
    }
}

class SolutionRemoveDuplicate {
    int RemoveDuplicate(int arr[]){
        if(arr.length == 0)
            return 0;
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i + 1;
    }
}