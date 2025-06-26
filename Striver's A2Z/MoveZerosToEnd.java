class MoveZerosToEnd {
    public static int[] getArray(int[] arr) {
        int j = 0;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == 0)
            return arr;
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0, 4, 0, 0, 12 };
        arr = getArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}