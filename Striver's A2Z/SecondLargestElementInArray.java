class SecondLargestElementInArray{

	public static int getElement(int[] arr){
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for(int i: arr){
			if(i > largest){
				secLargest = largest;
				largest = i;
			}else if(i > secLargest && i != largest){
				secLargest = i;
			}
		}
		if(secLargest == Integer.MIN_VALUE){
			return 0;
		}else return secLargest;
	}
	public static void main(String []args){
		int[] arr = {12,3,65,1,8};
		int val = getElement(arr);
		System.out.print("Second largest: "+ val);
	}
}