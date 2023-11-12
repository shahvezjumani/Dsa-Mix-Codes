import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,-3,1,0,45,22,-45};
        sort(arr);
        printArray(arr);
    }
    public static void sort(int [] arr){
        for(int i=0;i< arr.length - 1;i++){
            boolean swapped = false;
            for(int j=1;j < arr.length - i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
