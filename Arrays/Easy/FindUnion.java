package Arrays.Easy;

import java.util.*;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        SolutionFindUnion obj = new SolutionFindUnion();
        List<Integer> result = obj.UnionOfArrays(arr1, arr2);
        System.out.println("Union Of two arrays");
        for(int val: result) System.out.print(val + " ");
    }
}

class SolutionFindUnion {
    List<Integer> UnionOfArrays(int arr1[], int arr2[]){
        List<Integer> unionArray = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[i])
                    unionArray.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[j])
                    unionArray.add(arr2[j]);
                j++;
            }
            else if(arr1[i]==arr2[j]){
                if(unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[i])
                    unionArray.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i<n1) {
            if(unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr1[i])
                unionArray.add(arr1[i]);
            i++;
        }
        while (j<n2) {
            if(unionArray.isEmpty() || unionArray.get(unionArray.size() - 1) != arr2[j])
                unionArray.add(arr2[j]);
            j++;
        }
        return unionArray;
    }
}