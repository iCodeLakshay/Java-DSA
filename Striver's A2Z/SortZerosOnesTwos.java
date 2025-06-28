import java.util.Arrays;

public class SortZerosOnesTwos {
    public static int[] getArray(int[] arr){
        if(arr == null || arr.length==0) return null;
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,0,1,0,2};
        getArray(arr);
        for (int i : arr) {
            System.out.print(i+", ");    
        }
    }
}
