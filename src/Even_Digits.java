public class Even_Digits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,1458};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    //Check if Number contains even number of digits

    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }


    static int digits(int num) {
        if(num < 0) {
            num *= -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
