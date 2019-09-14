/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 10/6/17
 * Time: 1:36 PM
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class READER2 {
    //to read second line
    public READER2() throws FileNotFoundException{

        Scanner txtFile = new Scanner(new File("read.txt"));
        while (txtFile.hasNextLine()){
            //to convert Scanner to String
            String code = txtFile.nextLine();
            //int myInt = Integer.decode("int test = 1;");
            //System.out.println(myInt);
        }
        /*for (int loop = 10; loop <= 100; loop++) {
            System.out.println(loop);
        }*/
        txtFile.close();

    }
    public static void main(String args[]) throws FileNotFoundException{
        new READER2();
    }
}