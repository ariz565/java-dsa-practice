//write a java program to find duplicate elements in an array
import java.util.*;

// public class duplicateElements {
//     public static void findDup(int[] arr) {
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
//             if (map.get(key) > 1) {
//                 set.add(key);
//             }
//         }
//         System.out.println(set);

//     }
//     public static void main(String[] args){
//         int arr[] = { 1, 3,3,2, 2, 5, 6, 5, 5, 4, 6, 1, 7 };
//         findDup(arr);
//     }
// }

public class duplicateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements are:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
