
//Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array, else returns -1. Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative.
import java.util.*;

public class FixedPoint {
    public static void main(String[] args) {
        int arr[] = { -10, 5, 25, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                System.out.println("fixed point is " + i);

            } else
                System.out.println("fixed point is -1");
        }
    }
}
// int[] arr={-10,-5,0,3,7};
// for(int i=0;i<arr.length;i++){
// if(arr[i]==i){
// System.out.println("fixed point is "+i);
// break;
// }
// }
// System.out.println("fixed point is -1");
// }
// }
