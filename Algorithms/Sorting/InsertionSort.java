public class InsertionSort {
    
    public static int[] sort(int[] arr){
        for (int i = 0; i <= (arr.length)-1; i++) {
            int j=i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String []args){
        int[] arr = {12,5,36,2,87,85,1,25};
        arr = sort(arr);
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
}
