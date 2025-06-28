import java.util.HashMap;

public class TwoSumProblem {
    
    public static String checkSum(int [] arr, int target){
        HashMap<Integer, Integer> hmp = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int remain = target - num;
            if(hmp.containsKey(remain)){
                return "YES";
            }
            hmp.put(arr[i], i);
        }
        return "NO";
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,9,6,3};
        System.out.print("Do we have 2 sum ? " + checkSum(arr, 100)+",");
    }
}
