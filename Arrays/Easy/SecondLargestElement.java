package Arrays.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        SolutionSecondLargestElement obj = new SolutionSecondLargestElement();
        int[] arr = {3, 5, 7, 2, 8, 6};
        System.out.println("Second Largest Element is:" + obj.secondLargestElement(arr)); 
    }
}

class SolutionSecondLargestElement {
    int secondLargestElement(int arr[]){
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
