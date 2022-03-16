public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,4,0,2};

        System.out.println( findNumber(arr));


    }

    public static int findNumber(int[] arr){
        //Run a loop to check all elements in the array

        //Run a loop to check all elements in the array

        int i = 0;

        while(i<arr.length){

            //check if the arr[i] is strictly equal to its index e.g 0===0 etc;
            int correctIndex = arr[i];

            //If the number is not equal to its index, swap to the index;

            if (arr[i]<arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }

        // If the array at index is not equal to the index, return the index.(This is the actual answer need)
        for(int index = 0;index<arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    //Swap function to swap the elements
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
