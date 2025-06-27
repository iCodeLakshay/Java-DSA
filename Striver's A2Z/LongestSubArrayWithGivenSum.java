class LongestSubArrayWithGivenSum {
    public static int getSub(int[] arr, long k) {
        int size = arr.length;
        int left = 0, right = 0;
        int maxLength = 0;
        int sum = arr[0];

        while (right < size) {
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, (right - left) + 1);
            }
            right++;
            if (right < size)
                sum = sum + arr[right];
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 1, 2 };
        int length = getSub(arr, 8);
        System.out.print(length);
    }
}