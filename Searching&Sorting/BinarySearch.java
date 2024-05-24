//package Searching&Sorting;

public class BinarySearch {
    public static int binarysearch(int[] arr, int key) {
        int start =0;
        int end=arr.length-1;

        while(start <= end) {
            int mid = (start+end)/2;
            if(key==arr[mid] ){
                return mid;
            } else if(key > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr={1,2,3,6,8,10,15,18,20,125,150};
    int key=binarysearch(arr,10);
    System.out.println(key);
}
}
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) { // if start>end, it means that the key is not present in the array
//             int mid = start + (end - start) / 2; // to avoid integer overflow
//             if (key < arr[mid]) {
//                 end = mid - 1;
//             } else if (key > arr[mid]) {
//                 start = mid + 1;
//             } else { // key==arr[mid]
//                 return mid;
//             }
//         }
//         return -1;
//     }
    
// }
