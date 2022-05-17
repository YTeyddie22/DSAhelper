package strings;

public class Starpattern1 {

    public static void main(String[] args) {

        pattern(5);
    }

    static void pattern(int num){

        //For every row create a column at the rowth number
        for (int row = 0; row <=num ; row++) {

            for (int col = 0; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
