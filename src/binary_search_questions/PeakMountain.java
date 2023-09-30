package binary_search_questions;

public class PeakMountain {


    public static void main(String[] args) {



    }

    static int searchResult (int[] arr, int target){
        int peak = peakMountain(arr);
        int firstIntake = orderAgnosticSearch(arr, target, 0, peak);
        if(firstIntake != -1){
            return  firstIntake;
        }

        return orderAgnosticSearch(arr, target, peak+1, arr.length-1);
    }


    static int peakMountain ( int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }

        }

        return end;
    }

    static int orderAgnosticSearch(int[] arr,int target,int start, int end){

        boolean isAsc = arr[start] <arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
               if(target < arr[mid]){
                   end = mid-1;
               }else if(target >arr[mid]){
                   start = mid+1;
               }
            }

        }

        return -1;

    }
}
