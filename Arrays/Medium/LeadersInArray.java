package Arrays.Medium;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};

        // Create an instance of the Solution class
        SolutionOptimalLeaders finder = new SolutionOptimalLeaders();

        // Get leaders using class method
        ArrayList<Integer> ans = finder.leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}

class SolutionBruteForceLeaders {
    ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    count++;
                    break;
                }
            }
            if(count == 0)
                leaders.add(arr[i]);
        }
        // leaders.add(arr[n-1]);
        return leaders;
    } 
}

class SolutionOptimalLeaders {
	ArrayList<Integer> leaders(int arr[]){
		int n = arr.length;
		ArrayList<Integer> leaders = new ArrayList<>();
		if(arr.length == 0)
			return leaders;
		
		int max = arr[n-1];
		leaders.add(arr[n-1]);
		for(int i=n-2;i>=0;i--){
			if(arr[i]>max){
				leaders.add(arr[i]);
				max = arr[i];
			}
		}
		Collections.reverse(leaders);
		return leaders;
	}
}