package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        SolutionLargestElement obj = new SolutionLargestElement();
        int[] arr = {3, 5, 7, 2, 8, 6};
        obj.findLargest(arr, arr.length);
    }   
}

class SolutionLargestElement {
    void findLargest(int arr[], int n){
        int largest = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}