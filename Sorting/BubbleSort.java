package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        SolutionBubbleSort obj = new SolutionBubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        obj.BubbleSorting(arr);
    }
}

class SolutionBubbleSort {
    void BubbleSorting(int arr[]) {
        for(int i = arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array using Bubble Sort:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
