/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/6/17
 * Time: 1:36 PM
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class READER {
    //to read second line
    public READER() throws FileNotFoundException{

        //used to write the line i want in the code
        //immediately turned off afterwards
        PrintStream MakeWriter = new PrintStream(new File("read.txt"));
        MakeWriter.println("1");
        MakeWriter.close();

        Scanner txtFile = new Scanner(new File("read.txt"));

        while (txtFile.hasNextLine()) {
            //to convert Scanner to String
            String code = txtFile.nextLine();
            //System.out.println(code);
            int myInt = Integer.parseInt(code);
            System.out.println(myInt + 2);
        }

        txtFile.close();

    }
    public static void main(String args[]) throws FileNotFoundException {
        new READER();

    }
}