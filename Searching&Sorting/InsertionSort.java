public class InsertionSort {
    public void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
    public static void main(String[] args){
        int arr[]={8,2,6,1,5};
        InsertionSort obj=new InsertionSort();
        obj.insertion(arr);
        for(int res:arr){
            System.out.print(res+" ");
        }
    }
    
}
