class SelectionSort{
	
	public static int[] sort(int [] arr){
		int temp = 0;
		
		for(int i=0; i <= arr.length - 2; i++){
			
			int min = i;
			
			for(int j = i; j <= arr.length - 1; j++){
				if(arr[j] > arr[min])
				{
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static void main(String args[]){
		int[] arr = {12,5,6,35,1,25,89};
		
		arr = sort(arr);
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
}