/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/2/17
 * Time: 1:38 PM
 */
package BASICCODE;

public class ATest {

    public ATest() {

        //A basic Array
        int bucky[] = new int[10];

        for (int i = 0; i < bucky.length; i++) {
            bucky[i] = i;
        }
        /*bucky[0] = 87;
        bucky[1] = 543;
        bucky[9] = 65;*/

        System.out.println(bucky[5]);

        //A basic 2d array
        int[][] multi = new int[5][5];
        for (int x = 1; x < multi.length; x++) {
            for (int y = 1; y < multi[x].length; y++) {
                System.out.print(multi[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        new ATest();
    }

}