public class RearrangeArrayBySign {
    public static int[] rearrange(int[] arr){
        int[] pos = new int[arr.length/2];
        int[] neg = new int[arr.length/2];

        for (int i = 0, k=0, j=0; i < arr.length; i++) {
            if(arr[i] > 0)
                pos[k++] = arr[i];
            else if (arr[i] < 0)
                neg[j++] = arr[i];
        }

        for (int i = 0, k=0; i < pos.length; i++) {
            arr[k++] = pos[i];
            arr[k++] = neg[i];
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {1,2,-3,-1,-2,3};
        arr = rearrange(arr);
        System.out.print("Rearranged Array: ");
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
