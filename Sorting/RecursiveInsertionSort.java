package Sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        SolutionRecursiveInsertionSort obj = new SolutionRecursiveInsertionSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        obj.insertionSort(arr, 0, arr.length);
        System.out.println("Sorted array using Recursive Bubble Sort:");
        System.out.println(Arrays.toString(arr));
    }
}

class SolutionRecursiveInsertionSort {
    void insertionSort(int arr[], int i, int n){
        if(i==n)
            return;
        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        insertionSort(arr, i+1, n);
    }
}