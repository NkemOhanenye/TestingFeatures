/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 4:53 PM
 */
package JUnitTests.JUnitWriterTest;

import FunctionTests.Writer;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JUWriterTest {

    @Test
    public void test1() throws FileNotFoundException, IOException{
        Writer.create("Resources/","JUFile");
        Writer.write("hi");

        File f = new File("Resources/");
        assertTrue(f.exists());

    }//*/
    @Test
    public void test2() throws FileNotFoundException, IOException{
        Writer.create("Resources/","write");
        ArrayList empty = Writer.read();
        assertNotNull(empty);
    }//*/
    @Test
    public void test3() throws FileNotFoundException, IOException{
        Writer.create("Resources/","write");
        ArrayList empty = Writer.read();
        assertNull(empty);
    }//*/
}