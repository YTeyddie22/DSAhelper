package binary_search_questions;

public class Floor {

    public static void main(String[] args) {

        int[] arr = {11,22,44,55,66,77,88};
        int target = 99;
        int ans = floor(arr, target);

        System.out.println(ans);
    }

    static int floor(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]) {
            return -1;
        }
        return binarySearch(arr, target,start, end);
    }

    // Returns the greatest number in a range of numbers
    // Before the target
    static int binarySearch(int[] arr,int target,int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
