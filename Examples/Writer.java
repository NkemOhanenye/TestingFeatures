/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/3/17
 * Time: 4:42 PM
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Writer {

    public static void Writer(String words, String words2, String path, String fileName) throws FileNotFoundException{

        File file = new File(path + "/" + fileName + ".txt");
        PrintStream MakeWriter = new PrintStream(file);
        MakeWriter.println(words);
        MakeWriter.println(words2);
        MakeWriter.close();

    }
}