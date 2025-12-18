package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        SolutionReverseArray obj = new SolutionReverseArray();
        int[] arr = {1, 2, 3, 4, 5};
        obj.reverseArray(arr, 0, arr.length - 1);
        System.out.print("Reversed array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

class SolutionReverseArray {
    public void reverseArray(int[] arr, int start, int end){
        if(start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
}