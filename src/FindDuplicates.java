import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] arr) {


        int i = 0;

        while(i<arr.length){

            //check if the arr[i] is strictly equal to its index e.g 0===0 etc;
            int correctIndex = arr[i] -1;

            //If the number is not equal to its index, swap to the index;

            if ( arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }


        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
            return ans;
    }

    //Swap function to swap the elements
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
