import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int [] arr = {-34,45,0,34,23,45,-1000};
        sort(arr,0, arr.length-1);
        printArray(arr);
    }
    public static void sort(int [] arr,int low,int high){
        if(low > high){
            return;
        }
            int si = low;
            int ei = high;
            int mi = si + (ei-si)/2;
            int pivot = arr[mi];

            while(si <= ei){
                while(arr[si] < pivot){
                    si++;
                }
                while(arr[ei] > pivot){
                    ei--;
                }
                if(si <= ei){
                    int temp = arr[si];
                    arr[si++] = arr[ei];
                    arr[ei--] = temp;
                }
            }
            sort(arr,low,ei);
            sort(arr,si,high);
    }
    public static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}

