public class Order_Agnostic {

    public static void main(String[] args) {

        int[] arr = {23,34,45,67,89};
        int target = 45;

        int ans = orderAgnostic(arr, target);

        System.out.println(ans);


    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            //Checking for the middle element
            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
