
//given a sorted array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.
import java.util.*;

public class firstLastocc {

    public static void firstOcc(int[] arr,int x) {  //1 23455555567 8
        int start=0;
        int end=arr.length-1;
        int res=-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                res=mid;
                end=mid-1;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("first occurence is at "+res);
    }

    public static void lastOcc(int[] arr,int x) {
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                res=mid;
                start=mid+1;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println("last occurence is at "+res);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,10,25,25,25,25,50,75,100,125,150};
        int x=25;
        firstOcc(arr,x);
        lastOcc(arr,x);
    }
}
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 10, 25, 25, 25, 25, 50, 75, 100, 125, 150 };
//         int x = 25;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == x) {
//                 System.out.println("first occurence is at " + i);
//                 break;
//             }
//         }
//         for (int j = arr.length - 1; j >= 0; j--) {
//             if (arr[j] == x) {
//                 System.out.println("last occurence is at " + j);
//                 break;
//             }
//         }
//     }
// }









// int j=arr.length-1;
// while(j>=0){
// if(arr[j]==x){
// System.out.println("last occurence is at "+j);
// break;
// }
// j--;
// }
// }
// }