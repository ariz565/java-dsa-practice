// import java.util.HashSet;

// public class intersectionOftwoarray {
//     public static int intersectionA(int[] arr1, int[] arr2) {
//         HashSet<Integer> set = new HashSet<>();
//         int count = 0;
//         for (int i : arr1) {
//             set.add(i);
//         }
//         for (int j : arr2) {
//             if (set.contains(j)) {
//                 count++;
//                 set.remove(j);
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = { 1, 2, 3, 4 };
//         int[] arr2 = { 3, 4, 5, 6 };
//         int intersection = intersectionA(arr1, arr2);

//         System.out.println("size of Intersection of 2 arrays is: " + intersection);

//         if (intersection > 0) {
//             System.out.println("Elements in the intersection are: ");

//             for (int j = 0; j < intersection; j++) {
//                 System.out.print(arr2[j] + " ");
//             }
//         }
//     }
// }

import java.util.Arrays;
import java.util.HashSet;

public class intersectionOftwoarray {

    // A method to find the intersection of two arrays using HashSet
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Create a HashSet from the first array
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Create another HashSet to store the intersection elements
        HashSet<Integer> set2 = new HashSet<>();

        // Iterate over the second array and check if it contains any element from the first array
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        // Convert the intersection HashSet to an array
        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        // Return the intersection array
        return result;
    }

    // A method to print an array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // A main method to test the program
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] intersection = findIntersection(arr1, arr2);
        System.out.print("The intersection of ");
        printArray(arr1);
        System.out.print(" and ");
        printArray(arr2);
        System.out.print(" is ");
        printArray(intersection);

        // Test case 2
        int[] arr3 = {10, 20, 30, 40};
        int[] arr4 = {15, 25, 35, 45};
        intersection = findIntersection(arr3, arr4);
        System.out.print("The intersection of ");
        printArray(arr3);
        System.out.print(" and ");
        printArray(arr4);
        System.out.print(" is ");
        printArray(intersection);
    }
}
