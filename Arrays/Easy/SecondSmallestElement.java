package Arrays.Easy;

public class SecondSmallestElement {
    public static void main(String[] args) {
        SolutionSecondSmallestElement obj = new SolutionSecondSmallestElement();
        int[] arr = {3, 5, 7, 2, 8, 6};
        System.out.println("Second Smallest Element is:" + obj.secondSmallestElement(arr));
    }
}

class SolutionSecondSmallestElement {
    int secondSmallestElement(int arr[]){
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]>smallest)
                secondSmallest = arr[i];
        }
        return secondSmallest;
    }
}