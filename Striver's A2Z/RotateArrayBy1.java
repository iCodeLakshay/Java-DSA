class RotateArrayBy1{
	public static void rotate(int[] arr){
		int size = arr.length;
		if(size == 0) {return;}

		int lastElem = arr[size - 1];
		for(int i = size-1; i > 0; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = lastElem;
	}

	public static void main(String args[]){
		int[] arr = {1, 2, 3, 4, 5};
		rotate(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}