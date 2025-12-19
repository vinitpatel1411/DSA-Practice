package Hashing;

import java.util.*;

public class FrequencyOfElement {
    public static void main(String[] args) {
        SolutionCountFrequency obj = new SolutionCountFrequency();
        int[] arr = {1, 2, 1, 3, 4, 4, 4, 5};
        obj.countFrequency(arr);
    }
}

class SolutionCountFrequency {
    public void countFrequency(int n[]){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<n.length; i++){
            frequencyMap.put(n[i], frequencyMap.getOrDefault(n[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
