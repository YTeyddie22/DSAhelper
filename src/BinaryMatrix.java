import java.util.Arrays;

public class BinaryMatrix {

    public static void main(String[] args){

}


static int[] binaryInMatrix(int[][] arr,int target){
        int row = 0;
        int col=arr.length-1;

        while(row<arr.length && col >=0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            if(arr[row][col]<target){
                row++;
            }else{
                col--;
            }
        }

        return new int[]{-1,-1};
}


}
