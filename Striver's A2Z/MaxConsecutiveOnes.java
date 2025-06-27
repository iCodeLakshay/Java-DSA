class MaxConsecutiveOnes{

    public static int getValue(int []arr){
        int count = 0;
        int largeCount = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 1) {count = 0;}
            if(largeCount < count) {largeCount = count;} 
            count++;
        }

        return largeCount;
    }
    public static void main(String args[]){
        int[] arr = {1,1,0,1,1,1,1,1,0,1,1};

        System.out.println("Maximum consecutive ones: "+ getValue(arr));
    }
}