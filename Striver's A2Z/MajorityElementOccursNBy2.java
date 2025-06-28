//Find the Majority Element that occurs more than N/2 times

import java.util.HashMap;

public class MajorityElementOccursNBy2 {
    
    public static int findElement(int[] arr){
        HashMap<Integer, Integer> hmp = new HashMap<>();
        int reqCount = arr.length / 2;
        
        for (int i : arr){
            hmp.put(i, hmp.getOrDefault(i, 0)+1);
        }
        for (int key : hmp.keySet()) {
            if (hmp.get(key) > reqCount) {
                return key;
            }
        }        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 1, 1, 2};
        System.out.println(findElement(arr));
    }
}
