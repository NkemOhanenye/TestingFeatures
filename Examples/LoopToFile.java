/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/15/17
 * Time: 4:53 PM
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LoopToFile {
    public static void main(String args[]) throws FileNotFoundException {

        PrintStream MakeWriter = new PrintStream(new File("loop.txt"));
        for(double i = 0; i < 100; i++)
            MakeWriter.println(Double.toString(i));
        MakeWriter.close();

        Scanner scnr = new Scanner(new File("loop.txt"));

        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println(Double.valueOf(line));
        }
        scnr.close();

    }
}