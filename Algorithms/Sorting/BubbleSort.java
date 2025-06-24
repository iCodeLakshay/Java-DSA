class BubbleSort{

	public static int[] sort(int[] arr){
		int temp=0;
	
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}			
			}
		}
		return arr;
	}
	
	public static void main(String args[]){
		int[] arr = {12,25,5,26,3,4,88,10};
		arr = sort(arr);
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}