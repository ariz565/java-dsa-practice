// Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.Note: Find the element in O(logN) time and assume that all the elements are distinct.

public class SearchinPivot {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 3;
        int pivot = findPivot(arr, 0, arr.length - 1);
        System.out.println("pivot is " + pivot);
        if (pivot == -1) {
            System.out.println("element is not present");
        }
        if (arr[pivot] == key) {
            System.out.println("element is present at " + pivot);
        }
        if (arr[0] <= key) {
            System.out.println("element is present at " + binarySearch(arr, 0, pivot - 1, key));
        } else {
            System.out.println("element is present at " + binarySearch(arr, pivot + 1, arr.length - 1, key));
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    public static int findPivot(int[] arr, int low, int high) {
        if (high < low)
            return -1;
        if (high == low)
            return low;
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid - 1;
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }

}