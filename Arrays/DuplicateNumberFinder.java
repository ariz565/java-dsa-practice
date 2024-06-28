import java.util.Scanner;

public class DuplicateNumberFinder {

    // Function to find the duplicate number in the array using binary search
    public static int findDuplicate(int[] nums) {
        int left = 1, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            
            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array (n+1): ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
        
        scanner.close();
    }
}
