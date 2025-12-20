package Sorting;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        SolutionMergeSort obj = new SolutionMergeSort();
        int[] arr = {12, 11, 13, 5, 6};
        obj.mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

class SolutionMergeSort {
    private void merge(int arr[], int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right])
                temp.add(arr[left++]);
            else 
                temp.add(arr[right++]);
        }
        while(left<=mid)
            temp.add(arr[left++]);
        while(right<=high)
            temp.add(arr[right++]);
        for(int i=low;i<=high;i++)
            arr[i] = temp.get(i-low);
    }

    public void mergeSort(int arr[], int low, int high){
        if(low>=high)
            return;

        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
}