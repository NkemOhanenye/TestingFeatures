/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 4:03 PM
 */
package JUnitTests.Runner;

import JUnitTests.AssertNull.NullPoint;
import JUnitTests.AssertTest.Math;
import JUnitTests.TimeoutTest.InfiniteLoop;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

public class MultiFail {
    @Test
    public void test1(){
        int three = Math.add(4,5);
        assertEquals(9, three, 0);
    }
    @Test
    public void test2(){
        int four = Math.add(4,4);
        assertEquals(9, four, 0);
    }
    @Test
    public void test3(){
        ArrayList b = NullPoint.initializer(0);
        assertNull(b);
    }
    @Test (timeout = 500)
    public void test4(){
        int three = InfiniteLoop.loop(1);
        assertEquals(1, three, 0);
    }
}