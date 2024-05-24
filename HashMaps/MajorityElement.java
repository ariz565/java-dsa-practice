import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 10, 10, 10, 10, 10, 10, 10 };
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1); // 5= 8
            } else {
                map.put(i, 1); // 2 = 1
            }
        }
        int max = 0;
        int ans = 0;
        for (int i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                ans = i;
            }
        }
        return ans;
    }

}

// import java.util.*;

// public class MajorityElement {

// public static void majority(int nums[]) {
// HashMap<Integer, Integer> map = new HashMap<>();
// int n = nums.length;
// for (int i = 0; i < n; i++) {
// if (map.containsKey(nums[i])) {
// map.put(nums[i], map.get(nums[i]) + 1);
// } else {
// map.put(nums[i], 1);
// }
// }
// for (int key : map.keySet()) {
// if (map.get(key) > n / 3) {
// System.out.println(key);
// }
// }
// }

// public static void main(String[] args) {
// int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 }; // 9 / 3 = 3 > print
// majority(nums);
// }
// }
