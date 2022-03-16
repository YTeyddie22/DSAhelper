import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        // Strictly be from 1 to the total length of array as from 0 the index will be out of bounds
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
