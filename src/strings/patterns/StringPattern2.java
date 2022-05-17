package strings.patterns;

public class StringPattern2 {
    public static void main(String[] args) {

        pattern2(5);
    }

    static void pattern2(int num){

        //For every row create a column at the initialized number with column also the same size
        for (int row = 0; row <=num ; row++) {

            for (int col = 0; col <= num ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
