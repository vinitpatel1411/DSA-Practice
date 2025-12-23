package Arrays.Easy;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        SolutionLeftRotateByOne obj = new SolutionLeftRotateByOne();
        obj.RotateByOne(nums);
    }
}

class SolutionLeftRotateByOne {
    void RotateByOne(int arr[]){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;

        System.out.println("Left Rodated Array By One:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
