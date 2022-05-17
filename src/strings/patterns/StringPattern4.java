package strings.patterns;

public class StringPattern4 {

    public static void main(String[] args) {

        pattern4(6);
    }

    static void pattern4(int num){


        for (int row = 1; row <=num ; row++) {

            //Same as pattern 2 only that we print the column numbers

            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
