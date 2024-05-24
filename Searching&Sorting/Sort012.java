//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a java code to sort this array/list in a 'single scan'.

// public class Sort012 {
//     public static void sort012(int[] arr) {
//         int i = 0, j = 0, k = arr.length - 1;
//         while (j <= k) {
//             if (arr[j] == 0) {
//                 swap(arr, i, j);
//                 i++;
//                 j++;
//             } else if (arr[j] == 1) {
//                 j++;
//             } else {
//                 swap(arr, j, k);
//                 k--;
//             }
//         }
//     }
//     public static void swap(int[] arr, int i, int j) {
//         if (i == j)
//             return;
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = { 1, 0, 2, 1, 0, 2, 1, 0, 2 };
//         sort012(arr1);
//         for (int i : arr1) {
//             System.out.print(i + " ");
//         }
//     }
    
// }

// A function to sort an array of 0s, 1s and 2s in a single scan
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0, 2, 1, 0, 2 };
        sortArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

public static void sortArray(int[] arr) {
  // Initialize three pointers: low, mid and high
  int low = 0; // points to the first unsorted element
  int mid = 0; // points to the current element
  int high = arr.length - 1; // points to the last unsorted element

  // Loop until mid crosses high
  while (mid <= high) {
    // If the current element is 0, swap it with the low element and increment both low and mid
    if (arr[mid] == 0) {
      swap(arr, low, mid);
      low++;
      mid++;
    }
    // If the current element is 1, just increment mid
    else if (arr[mid] == 1) {
      mid++;
    }
    // If the current element is 2, swap it with the high element and decrement high
    else {
      swap(arr, mid, high);
      high--;
    }
  }
}

// A helper function to swap two elements in an array
public static void swap(int[] arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}
}