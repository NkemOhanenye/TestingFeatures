/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/27/17
 * Time: 4:45 PM
 */

import org.jfree.data.time.Second;

public class TellTime {

    public TellTime() throws InterruptedException{
        while (System.currentTimeMillis() >= 0) {
            Second now = new Second();
            System.out.println(now);
            Thread.sleep(1000);
        }
    }

    public static void main(String args[]) throws InterruptedException{
        new TellTime();
    }
}