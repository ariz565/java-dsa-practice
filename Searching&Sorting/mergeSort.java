// A class to implement merge sort algorithm
public class mergeSort {
    // A method to sort an array by dividing it into smaller subarrays and merging
    // them
    public static void sort(int[] arr, int start, int end) {
        // Base case: if the subarray has one or zero elements, it is already sorted
        if (start >= end) {
            return;
        }

        // Find the middle index of the subarray
        int mid = (start + end) / 2;

        // Recursively sort the left and right halves of the subarray
        sort(arr, start, mid);
        sort(arr, mid + 1, end); // 12 3456

        // Merge the sorted halves into a new array
        merge(arr, start, mid, end);
    }

    // A method to merge two sorted subarrays into one sorted array
    public static void merge(int[] arr, int start, int mid, int end) {
        // Create a new array to store the merged elements
        int[] merged = new int[end - start + 1];

        // Initialize pointers for the left and right subarrays
        int left = start;
        int right = mid + 1;

        // Initialize an index for the merged array
        int index = 0;

        // Loop until either subarray is exhausted
        while (left <= mid && right <= end) {
            // Compare the current elements of the subarrays and add the smaller one to the
            // merged array
            if (arr[left] <= arr[right]) {
                merged[index] = arr[left];
                left++;
            } else {
                merged[index] = arr[right];
                right++;
            }
            index++;
        }

        // Copy any remaining elements from the left subarray to the merged array
        while (left <= mid) {
            merged[index] = arr[left];
            left++;
            index++;
        }

        // Copy any remaining elements from the right subarray to the merged array
        while (right <= end) {
            merged[index] = arr[right];
            right++;
            index++;
        } // 1 2 3 4 5

        // Copy the merged array back to the original array
        for (int i = 0; i < merged.length; i++) {
            arr[start + i] = merged[i];
        }
    }

    // A main method to test the sorting algorithm
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = { 5, 4, 3, 2, 1 };

        // Sort the array using merge sort
        sort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// public class mergeSort {
// public static void divide(int arr[], int start, int end){
// if(start>=end){
// return;
// }

// int mid=start+(end-start)/2;
// divide(arr,start,mid);
// divide(arr,mid+1,end);
// conquer(arr,start,mid,end);
// }

// public static void conquer(int arr[], int start, int mid, int end){
// int merged[]=new int[end-start+1];
// int idx1=start;
// int idx2=mid+1;
// int x=0;
// while(idx1<=mid && idx2<=end){
// if(arr[idx1]<= arr[idx2]){
// merged[x++]=arr[idx1++];
// }
// else{
// merged[x++]=arr[idx2++];
// }
// }

// while(idx1<=mid){
// merged[x++]=arr[idx1++];
// }
// while(idx2<=end){
// merged[x++]=arr[idx2++];
// }
// for(int i=0,j=start;i<merged.length;i++,j++){
// arr[j]=merged[i];
// }
// }
// public static void main(String[] args) {
// int arr[]={5,4,3,2,1};
// divide(arr,0,arr.length-1);
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }
