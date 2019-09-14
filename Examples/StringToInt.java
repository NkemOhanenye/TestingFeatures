import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 10/6/17
 * Time: 2:55 PM
 */

public class StringToInt {

    public static void main(String args[]) throws FileNotFoundException {

        PrintStream MakeWriter = new PrintStream(new File("tall.txt"));
        MakeWriter.println("12345");
        MakeWriter.println("3456778");
        MakeWriter.println("234234234");
        MakeWriter.println("34234324234"); //number too large so wont print
        MakeWriter.close();

        //creating File instance to reference text file in Java
        //Creating Scanner instance to read File in Java
        Scanner scanner = new Scanner(new File("tall.txt"));

        while(scanner.hasNextInt()) //was .hasNextInt (kept leaving out 1 line)
        {

            String tall = scanner.nextLine();
            int StrToNum = Integer.parseInt(tall);
            System.out.println(StrToNum + 2); //@Number 2, used to show working int

        }

        scanner.close();

    }

}
