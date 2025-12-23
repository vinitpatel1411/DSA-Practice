package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        SolutionQuickSort obj = new SolutionQuickSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        obj.quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array using Quick Sort:");
        System.out.println(Arrays.toString(arr));
    }
}

class SolutionQuickSort {
    void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivot = arr[high];
            int pivotIndex = high;
            int i = low-1;
            for(int j = low; j<high;j++){
                if(arr[j] <= pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
            pivotIndex = i+1;
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
}