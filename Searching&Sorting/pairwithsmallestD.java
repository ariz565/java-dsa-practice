
//Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference is the smallest, and return the difference.
import java.util.*;

public class pairwithsmallestD {
    public static int smallestDiff(int[] arr1, int n, int arr2[], int m) {
        int p = 0;
        int q = 0;
        int minDiff = Math.abs(arr1[0] - arr2[0]);
        for (int i = 0; i < arr1.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[index]) {
                    index = j;
                }
            }
            int smallestNumber = arr1[index];
            arr1[index] = arr1[i];
            arr1[i] = smallestNumber;
        }
        for (int i = 0; i < arr2.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[index]) {
                    index = j;
                }
            }
            int smallestNumber = arr2[index];
            arr2[index] = arr2[i];
            arr2[i] = smallestNumber;
        }

        while (p < n && q < m) {
            minDiff = Math.min(minDiff, Math.abs(arr1[p] - arr2[q]));
            if (arr1[p] < arr2[q]) {
                p++;
            } else {
                q++;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The smallest difference is: " + smallestDiff(arr1, n, arr2, m));
        sc.close();
    }
}
