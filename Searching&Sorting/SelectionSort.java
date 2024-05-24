public class SelectionSort {
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
                // int temp=arr[i];
                // arr[i]=arr[minIndex];
                // arr[minIndex]=temp;
            }
        } 
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        // for (int i : arr) {
        // System.out.print(i + " ");
    }
}
