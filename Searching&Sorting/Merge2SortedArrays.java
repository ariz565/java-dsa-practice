public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };
        int[] arr3 = merge(arr1, arr2);
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length)
            arr3[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];

        while (i < arr1.length)
            arr3[k++] = arr1[i++];

        while (j < arr2.length)
            arr3[k++] = arr2[j++];

        return arr3;
    }
    
}
