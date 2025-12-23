package Sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        SolutionRecursiveBubbleSort obj = new SolutionRecursiveBubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        obj.recursiveBubbleSort(arr, arr.length);
        System.out.println("Sorted array using Recursive Bubble Sort:");
        System.out.println(Arrays.toString(arr));
    }
}

class SolutionRecursiveBubbleSort {
    void recursiveBubbleSort(int arr[], int n){
        if(n==1)
            return;
        boolean swapped = false;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }
        if(!swapped)
            return;
        recursiveBubbleSort(arr, n-1);
    }
}
