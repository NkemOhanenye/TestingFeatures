/**
 * Created by Nkem Ohanenye on 2/17/17.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadandWrite2 {
    public static void main(String args[])
            throws FileNotFoundException {
        //realizes that the file may fail but will run
        PrintStream diskWriter =
                new PrintStream(new File("approval.txt"));
        //creates a new file
        diskWriter.print('O');
        diskWriter.println('K');
        //adds test to the file
        diskWriter.close(); //closes the program
    }
}
