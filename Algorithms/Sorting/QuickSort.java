class QuickSort{

	public static void sort(int[] arr, int low, int high){
		if(low < high){
			int pivotIdx = partition(arr, low, high);
			sort(arr, low, pivotIdx-1);
			sort(arr, pivotIdx+1, high);
		}
	}
	
	public static int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j){
			while(arr[i] <= pivot && i < high) i++;
			
			while(arr[j] > pivot && j >= low) j--;
			
			if(i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		
		return j;
	}
	public static void main(String[] args){
		int[] arr = {25,22,3,14,25,5,48,26};
		sort(arr, 0, arr.length - 1);
		for(int i: arr){
			System.out.print(i+ ", ");
		}
	}
}