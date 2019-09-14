/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 3:55 PM
 */
package JUnitTests.TimeoutTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeoutTest {

    @Test (timeout = 1000)
    public void test(){
        int three = InfiniteLoop.loop(1);
        assertEquals(1, three, 0);
    }
}