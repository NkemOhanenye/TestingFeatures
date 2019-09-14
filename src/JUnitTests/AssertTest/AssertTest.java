/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 3:37 PM
 */
package JUnitTests.AssertTest;

import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.rmi.server.ExportException;

import static org.junit.Assert.assertEquals;

public class AssertTest {

    @Test
    public void test() {
        int three = Math.add(4,5);
        assertEquals(9, three, 0);
    }

}