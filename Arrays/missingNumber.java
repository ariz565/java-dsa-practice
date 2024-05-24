//Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. The array does not containany duplicates. Your task is to find the missing number.

// public class missingNumber {
//     public static void main(String[] args) {
//         int[] a = { 1, 2, 3, 5 };
//         int n = 5;
//         int sum = 0;
//         for (int i = 0; i < a.length; i++) {
//             sum += a[i];
//         }
//         int total = (n * (n + 1)) / 2;
//         System.out.println(total - sum);
//     }
// }

public class missingNumber {
    public static int missingNum(int[] a, int N) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int total = (N * (N + 1)) / 2;
        return total - sum;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNum(a, n));
    }
}