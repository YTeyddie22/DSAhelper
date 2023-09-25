import java.util.Arrays;

public class Linear_search
{
    public static void main(String[] args) {

        //Linear Search

        int[] arr = {1,8,5,9,45,78,14};
        int target = 45;
        int ans = linearSearch(arr, target);

        System.out.println(ans);

        // Linear Search Using Strings;

        String str = "Teddy";
        char targetChar = 'd';
        boolean searchCharAns = searchString(str, targetChar);
        System.out.println(searchCharAns);

        // Search in Range of elements

        int[] arrRange = {78,59,45,5,73};
        int targetInRange = 59;
        int ansTargetInRange = searchRange(arrRange,targetInRange,1,4);
        System.out.println(ansTargetInRange);

        //Search in 2D Array

        int[][] arrDimensioned = {
                {45,56,78},
                {96,5,8,9,6,2},
                {1,12,32}
        };
        int targetDimensioned = 96;
        int[] ansDimensional = searchDimensional(arrDimensioned, targetDimensioned);
        System.out.println(Arrays.toString(ansDimensional));



    }

    static int linearSearch(int[] arr, int target) {
        //Check if the array is empty
        if(arr.length == 0) {
            return -1;
        }

        //Check if the element in the array is the target
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] == target) {
                // Find the index
                return index;
            }
        }
        return -1;
    }


    // Finding the actual element
    static int linearSearch2(int[] arr, int target) {
        //Check if the array is empty
        if(arr.length == 0) {
            //Element might be actually -1;
            return Integer.MAX_VALUE;
        }

        //Check if the element in the array is the target
        for (int element : arr) {
            if (element == target) {
                // Find the element
                return element;
            }
        }
        //Element might be actually -1;
        return Integer.MAX_VALUE;
    }

    //Searching through a string
    static boolean searchString(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for(char ch: str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }

    //Search in Range

    static int searchRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }

    //Search in 2D Array

    static int[] searchDimensional(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
