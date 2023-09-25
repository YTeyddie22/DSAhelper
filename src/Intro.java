

public class Intro {

    public static void main(String[] args) {
        System.out.println("Hello!! These algorithms will aid you in solving problems you might face");
        System.out.println();

        int[] arr = {1,2,23,4,5};
        //swap(arr, 1, 2);


        //System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr) {
        int maxNum = arr[0];
        for (int j : arr) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }
}
