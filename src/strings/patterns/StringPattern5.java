package strings.patterns;

public class StringPattern5{

    public static void main(String[] args) {

        pattern5(6);
    }

    static void pattern5(int num){


        //Iteration for ascending stars
        for (int row = 1; row < 2*num ; row++) {


            //double the number then reduce the rowth number (e.g 5)

            // 5*2 =10  then subract row 7 we remain with three stars at the seventh row
            int totalCols = row<num? row: 2*num-row;
            for (int col = 1; col <= totalCols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
