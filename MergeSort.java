import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int [] arr = {0,-8,4,0,-2,3};
        sort(arr,0, arr.length-1);
        displayArray(arr);
    }
    public static void sort(int [] arr,int si,int ei){
        if(si < ei){
            int mi = si + (ei - si) / 2;
            sort(arr,si,mi);
            sort(arr,mi+1,ei);
            merge(arr,si,mi,ei);

        }
    }
    public static void merge(int [] arr,int si,int mi,int ei){
        int [] Larr = new int [mi - si +1];
        int [] Rarr = new int [ei - mi];

        for(int i=0;i<Larr.length;i++){
            Larr[i] = arr[si+i];
        }
        for(int i=0;i<Rarr.length;i++){
            Rarr[i] = arr[mi+i+1];
        }

        int i=0,j=0;
        int k = si;

        while(i < Larr.length && j < Rarr.length){
            if(Larr[i] < Rarr[j]){
                arr[k++] = Larr[i++];
            }else {
                arr[k++] = Rarr[j++];
            }
        }
        while(i < Larr.length){
            arr[k++] = Larr[i++];
        }
        while(j < Rarr.length){
            arr[k++] = Rarr[j++];
        }
    }
    public static void displayArray(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}