import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * Java program to read file using Scanner class in Java.
 * java.util.Scanner is added on Java 5 and offer convenient method to read data
 *
 * @author
 */
public class ScannerExample {

    public static void main(String args[]) throws FileNotFoundException {

        PrintStream MakeWriter = new PrintStream(new File("test.txt"));
        MakeWriter.println("--------------------- START-----------------------------------------------------");
        MakeWriter.println("Java provides several way to read files.");
        MakeWriter.println("You can read file using Scanner, FileReader, FileInputStream and BufferedReader.");
        MakeWriter.println("This Java program shows How to read file using java.util.Scanner class.");
        MakeWriter.println("--------------------- END--------------------------------------------------------");
        MakeWriter.close();

        //creating File instance to reference text file in Java
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(new File("test.txt"));

        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }
        scnr.close();

    }

}
