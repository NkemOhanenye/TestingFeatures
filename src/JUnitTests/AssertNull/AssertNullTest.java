/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 3:50 PM
 */
package JUnitTests.AssertNull;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNull;

public class AssertNullTest {

    @Test
    public void test(){
        ArrayList b = NullPoint.initializer(0);
        assertNull(b);
    }
}