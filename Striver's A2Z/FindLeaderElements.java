public class FindLeaderElements {
    
    public static void getLeaders(int[] arr){

        // Optimal approach
        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight+ " ");
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] >= maxFromRight){
                maxFromRight = arr[i];
                System.out.print(maxFromRight+ " ");
            }
        }


        // Better Approach
        // int flag = 0;
        // System.out.print("Leader elements: ");
        // for (int i = 0; i < arr.length-1; i++) {
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] > arr[j]){
        //             flag = 1;
        //             continue;
        //         }
        //         else {
        //             flag = 0;
        //             break;
        //         }
        //     }
        //     if(flag == 1)
        //         System.out.print(arr[i]+ " ");
        // }
        // System.out.print(arr[arr.length-1]);
    }
    public static void main(String args[]){
        int[] arr = {4, 7, 1, 0};
        int[] arr2 = {10, 22, 12, 3, 0, 6};
        getLeaders(arr);
        System.out.println();
        getLeaders(arr2);
    }
}
