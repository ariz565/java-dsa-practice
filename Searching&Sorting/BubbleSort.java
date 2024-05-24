public class BubbleSort {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            // for (int j = 0; j < arr.length - 1; j++) {
            // if (arr[j] > arr[j + 1]) {
            // int temp = arr[j];
            // arr[j] = arr[j + 1];
            // arr[j + 1] = temp;
            // swapped = true;
            // }
            // }
            // if (swapped == false) {
            // break;
            // }
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // if (arr[j] < arr[j + 1]) {
                    int temp = arr[j]; // int temp = arr[j + 1];
                    arr[j] = arr[j + 1]; // arr[j + 1] = arr[j];
                    arr[j + 1] = temp; // arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={8,2,6,1,5};
        bubble(arr);
        for(int res:arr){
            System.out.print(res+" ");
        }
    }
}
