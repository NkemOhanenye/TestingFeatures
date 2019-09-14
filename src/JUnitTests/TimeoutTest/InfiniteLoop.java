/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 3:53 PM
 */
package JUnitTests.TimeoutTest;

public class InfiniteLoop {
    public static int loop(int one){
        while (one == 1){
            one = 1;
        }
        return 2;
    }
}