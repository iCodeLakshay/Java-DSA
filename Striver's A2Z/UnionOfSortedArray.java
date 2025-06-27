import java.util.ArrayList;
import java.util.HashSet;

class UnionOfSortedArray{

    public static ArrayList<Integer> getUnion(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        for (int iterable : hs) {
            Union.add(iterable);
        }
        return Union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 4, 4, 5, 6, 7};
        int[] arr2 = {2, 3, 4, 5, 5, 7, 8};

        ArrayList<Integer> union = getUnion(arr1, arr2);
        for (int itr : union) {
            System.out.print(itr + " ");
        }
    }
}