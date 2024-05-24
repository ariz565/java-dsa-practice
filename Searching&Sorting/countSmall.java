//You are given two arrays of integers. Let's call the first array A and the second array B. A finds the number of elements in array B that are smaller than or equal to that element for every array element.

// A public class to count the number of elements in array B that are smaller than or equal to that element for every array element in array A
public class countSmall {
    // A public static method to count the number of elements in array B that are
    // smaller than or equal to that element for every array element in array A
    public static void countsmall(int arr1[], int arr2[]) {
        // Initialize a variable to store the count
        int count = 0;
        // Loop through each element of array A
        for (int i = 0; i < arr1.length; i++) {
            // Loop through each element of array B
            for (int j = 0; j < arr2.length; j++) {
                // If the element of array A is greater than or equal to the element of array B,
                // increment the count
                if (arr1[i] >= arr2[j]) {
                    count++;
                }
            }
            // Print the count for the current element of array A
            System.out.print(count + " ");
            // Reset the count to zero for the next element of array A
            count = 0;
        }
    }

    // The main method to test the counting method
    public static void main(String[] args) {
        // Create two arrays of integers
        int[] arr1 = { 2, 3, 0 };
        int[] arr2 = { 5, 1 };
        // Call the counting method with the two arrays as arguments
        countsmall(arr1, arr2);
    }

}
// Time Complexity: O(n^2)