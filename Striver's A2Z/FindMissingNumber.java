class FindMissingNumber{

    public static int getIndex(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {14,58,5,69,21,47};
        int k = 58;

        int flag = getIndex(arr, k);
        if(flag > 0){
            System.out.print("Element found at "+ (flag+1));
        }else{
            System.out.print("Element not found");
        }
        
    }
}