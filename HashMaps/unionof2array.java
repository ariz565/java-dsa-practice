
// import java.util.HashMap;
import java.util.HashSet;
//int [] arr = {7,3,9}
//int [] arr2 = {6,3,9,2,9,4}
//int[] arr3= {7,3,9,6,2,4} //size 6

public class unionof2array {
    public static int unionofArray(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }
        for (int j : arr2) {
            set.add(j);
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        System.out.println("Union  of 2 arrays is: " + unionofArray(arr1, arr2));

    }

}
