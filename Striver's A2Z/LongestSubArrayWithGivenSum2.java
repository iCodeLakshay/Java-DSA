import java.util.HashMap;

public class LongestSubArrayWithGivenSum2 {

    public static int getSub(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int maxLength = 0;


        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];

            if (map.containsKey(prefix_sum - k)) {
                int length = i - map.get(prefix_sum - k);
                maxLength = Math.max(maxLength, length);
            }
            if(!map.containsKey(prefix_sum)){
                map.put(prefix_sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 1, 1, 2, -1, -3, -4 };
        int length = getSub(arr, 3);
        System.out.println("Length of longest subarray with given sum (including -ve numbers): "+ length);
    }
}
