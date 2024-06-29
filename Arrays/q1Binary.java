import java.util.Scanner; // Import Scanner for user input
import java.util.Arrays;

class BinarySearch { // Rename class for clarity
    public int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2; //calculating mid value
            if(arr[mid] == x) {
                return mid; // target found at index mid
            } else if (arr[mid] < x) {
                left = mid + 1; // target is in the right half
            } else {
                right = mid - 1; // target is in the left half
            }
        }
        return -1;
    }
}

public class q1Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch searchFunction = new BinarySearch();

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements in ascending order:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input target value
        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        // Perform search
        int index = searchFunction.search(nums, target);

        // Display result
        System.out.println("Index of " + target + ": " + (index != -1 ? index : "Not found"));
    }
} 
