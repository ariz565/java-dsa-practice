//Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

import java.util.*;

public class NumberOfOcc {
    public int count(int[] arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array and the number to be searched: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        NumberOfOcc obj = new NumberOfOcc();
        System.out.println(obj.count(arr, n, x));
        sc.close();
    }
}