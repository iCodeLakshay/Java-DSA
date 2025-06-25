class MergeSort{
	
	public static void sort(int[] arr, int low, int high){
		if(low >= high) return;
		
		int mid = low + (high-low)/2;
		
		sort(arr, low, mid);
		sort(arr, mid+1, high);
		
		merge(arr, low, mid,high);
	}
	
	public static void merge(int[] arr, int low, int mid, int high){
		int[] leftArr = new int[mid-low + 1];
		int[] rightArr =  new int[high-mid];
		
		for(int i=0; i < leftArr.length; i++){
			leftArr[i] = arr[low + i]; 
		}
		
		for(int j=0; j < rightArr.length; j++){
			rightArr[j] = arr[mid+1 + j];
		}
		
		int i=0, j=0, k=low;
		
		while(i < leftArr.length && j < rightArr.length){
			if(leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			}else{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < leftArr.length){
			arr[k++] = leftArr[i++];
		}
		while(j < rightArr.length){
			arr[k++] = rightArr[j++];
		}
	}
	
	public static void main(String []args){
		int[] arr = {1,25,78,4,59,6,3,24,58};
		sort(arr, 0, arr.length - 1);
		System.out.print("Sorted array: ");
		for(int i: arr){
			System.out.print(i+ ", ");
		}
	}
}