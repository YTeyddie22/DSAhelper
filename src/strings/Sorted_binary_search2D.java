import java.util.Arrays;

public class Sorted_binary_search2D {

    public static void main(String[] args) {

        int[][] arr  = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 9)));

    }

    static int[] binarySearch(int[][] matrix, int row, int columnStart, int columnEnd, int target) {
        while (columnStart <=columnEnd) {
            int mid = columnStart + (columnEnd - columnStart) / 2;

            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target) {
                columnStart = mid + 1;
            } else {
                columnEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if(rows == 1) {
            binarySearch(matrix, 0, 0, columns-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnMid = columns / 2;

        while(rowStart < rowEnd - 1) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if(matrix[mid][columnMid] == target) {
                return new int[]{mid,columnMid};
            }

            if(matrix[mid][columnMid] < target) {
                rowStart = mid;
            }
            else {
                rowEnd = mid;
            }
        }

        if(matrix[rowStart][columnMid] == target) {
            return new int[]{rowStart, columnMid};
        }

        if(matrix[rowStart + 1][columnMid] == target) {
            return new int[]{rowStart + 1, columnMid};
        }

        if(target <= matrix[rowStart][columnMid - 1]) {
            return binarySearch(matrix, rowStart,0, columnMid - 1, target);
        }

        if(target >= matrix[rowStart][columnMid + 1] && target <= matrix[rowStart][columns - 1]) {
            return binarySearch(matrix, rowStart, columnMid + 1, columns - 1, target );
        }

        if(target <= matrix[rowStart + 1][columnMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0 , columnMid, target);

        } else {
            return binarySearch(matrix, rowStart + 1, columnMid + 1, columns - 1, target);
        }

    }

}
