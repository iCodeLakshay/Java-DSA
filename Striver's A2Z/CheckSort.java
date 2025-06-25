class CheckSort{
	public static boolean check(int[] arr){
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                ascending = false;
            if (arr[i] < arr[i + 1])
                descending = false;
        }

        return ascending || descending;
    }
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.print("Array is sorted ? : "+ check(arr) );
	}
}