import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int [] arr = {-34,45,0,34,23,45,-1000};
        sort(arr,0, arr.length-1);
        printArray(arr);
    }
    public static void sort(int [] arr,int si,int ei){
        if(si >= ei){
            return;
        }
            int mi = si + (ei-si) / 2;
            sort(arr,si,mi);
            sort(arr,mi+1,ei);
            merge(arr,si,mi,ei);

    }
    public static void merge(int [] arr,int si,int mi,int ei){
        int size1 = mi - si + 1;
        int size2 = ei - mi;
        int [] left = new int [size1];
        int [] right = new int [size2];

        for(int i=0;i<left.length;i++){
            left[i] = arr[si+i];
        }
        for(int i=0;i<right.length;i++){
            right[i] = arr[mi+1+i];
        }
        int i=0,j=0;
        int k = si;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }
    public static void printArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
