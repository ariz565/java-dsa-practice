// package TimeComplexity;
//write a java program to find unique element in an array

// public class UniqueElement {
//     public static void main(String[] args) {
//         int arr[] = { 1, 3, 2, 5, 6, 5, 5, 4, 6, 1, 7 };
//         int unique = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             unique = unique ^ arr[i];
//         }
//         System.out.println(unique);
//     }

// }

// import java.util.HashMap;
// import java.util.HashSet;

// public class UniqueElement {
//     public static void findUnique(int[] arr) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         HashSet<Integer> set = new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             int key = arr[i];
//             if (map.containsKey(key)) {
//                 int of = map.get(key);
//                 int nf = of + 1;
//                 map.put(key, nf);
//             } else {
//                 map.put(key, 1);
//             }

//         }
//         for (Integer key : map.keySet()) {
//             if (map.get(key) == 1) {
//                 set.add(key);
//             }
//         }
//         System.out.println(set);

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 3,3,2, 2, 5, 6, 5, 5, 4, 6, 1, 7 };
//         findUnique(arr);
//     }
// }

