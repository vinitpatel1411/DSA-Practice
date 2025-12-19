package Hashing;
import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        SolutionFrequencyCounter obj = new SolutionFrequencyCounter();
        int[] arr = {1, 2, 1, 3, 4, 4, 4, 5};
        obj.countFrequency(arr);
    }
}

class SolutionFrequencyCounter {
    public void countFrequency(int n[]){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<n.length; i++){
            frequencyMap.put(n[i], frequencyMap.getOrDefault(n[i], 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MIN_VALUE;
        int maxElem = Integer.MIN_VALUE, minElem = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();
            if(count > maxFreq){
                maxFreq = count;
                maxElem = element;
            }
            if(count < minFreq || minFreq == Integer.MIN_VALUE){
                minFreq = count;
                minElem = element;
            }
        }
        System.out.println("Element with maximum frequency: " + maxElem + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with minimum frequency: " + minElem + " (Frequency: " + minFreq + ")");
    }
}