import java.util.Scanner;

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (n+1): ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (each in the range [1, " + (n-1) + "]):");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < 1 || num > n - 1) {
                System.out.println("Invalid input. Each number should be in the range [1, " + (n-1) + "].");
                return;
            }
            nums[i] = num;
        }

        int result = solution.findDuplicate(nums);
        System.out.println("The duplicate number is: " + result);

        scanner.close();
    }
}