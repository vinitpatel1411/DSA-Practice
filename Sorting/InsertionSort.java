package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        SolutionInsertionSort obj = new SolutionInsertionSort();
        int arr[] = {12, 11, 13, 5, 6};
        obj.insertionSorting(arr);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

class SolutionInsertionSort {
    void insertionSorting(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = key;
        }    
    }
}