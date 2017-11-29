package FunctionTests;/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/3/17
 * Time: 4:44 PM
 */

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriterTest{

    private Writer writer = new Writer();

    public WriterTest() throws  FileNotFoundException, IOException{
        //Double dub = 25.5;
        //FileGui fileGui = new FileGui();
        //fileGui.writeGui("write", Double.toString(dub));
        writer.create("write");
        //writer.write(Double.toString(dub));

        System.out.println(writer.read());
    }

    public static void main(String args[])
            throws FileNotFoundException, IOException{
        new WriterTest();
    }
}