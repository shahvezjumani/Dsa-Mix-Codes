import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {-34,45,0,34,23,45,-1000};
        sort(arr);
        printArray(arr);
    }
    public static void sort(int [] arr){
        for(int i=0;i< arr.length -1;i++){
            int lastindex = arr.length -1 - i;
            int maxindex = getMaxIndex(arr,0,lastindex);
            swap(arr,maxindex,lastindex);
        }
    }
    public static int getMaxIndex(int [] arr,int start,int end){
        int max = start;
        for(int i=start;i<= end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int [] arr,int firindex,int secindex){
        int temp = arr[firindex];
        arr[firindex] = arr[secindex];
        arr[secindex] = temp;
    }
    public static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
