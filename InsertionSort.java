import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {-34,45,0,34,23,45,-1000};
        sort(arr);
        printArray(arr);
    }
    public static void sort(int [] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                boolean swapped = false;
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                if(!swapped){
                    break;
                }
            }
        }
    }
    public static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
