import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        // Strictly be from 1 to the total length of array as from 0 the index will be out of bounds
        int[] arr = {10,5,3,6,7,9,8,4,1,2};
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {

       int i = 0;
       while(i<arr.length){
           int correctIndex = arr[i]-1;
           if(arr[i]!=arr[correctIndex]){
               swap(arr, i, correctIndex);
           }else{
               i++;
           }
       }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
