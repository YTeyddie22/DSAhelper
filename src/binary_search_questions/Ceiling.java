package binary_search_questions;

public class Ceiling {

    public static void main(String[] args) {

        int[] arr = {11,22,44,55,66,77,88};
        int target = 10;
        int ans = ceiling(arr, target);

        System.out.println(ans);
    }
    static int ceiling(int[] arr,int target) {

        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start]) {
            return -1;
        }
        return binarySearch(arr, target,start, end);
    }

    // Returns the smallest number in a range of numbers
    // After the target
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
        return start;
    }
}
