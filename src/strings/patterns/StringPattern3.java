package strings.patterns;

public class StringPattern3 {

    public static void main(String[] args) {

        pattern3(6);
    }

    static void pattern3(int num){


        for (int row = 1; row <= num ; row++) {

            //For every row (subtract the parameter number from the number of row at i then add one

            for (int col = 1; col <= num-row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
