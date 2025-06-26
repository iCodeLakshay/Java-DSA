class RotateArrayByKNumbers{
	public static void rotate(int[] arr, int k){
		int size = arr.length;
		if(size == 0 || arr == null) {return;}
        k = k % size;

        reverse(arr, 0, size - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);
	}
    public static void reverse(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

	public static void main(String args[]){
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		rotate(arr, 4);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}