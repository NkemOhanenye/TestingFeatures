import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by otakusenseihig on 3/10/17.
 */
public class Looper implements Runnable{
    private AtomicBoolean keepRunning;

    public Looper(){
        keepRunning = new AtomicBoolean(true);
    }

    public void stop(){
        keepRunning.set(false);
    }

    @Override
    public void run(){
        while (keepRunning.get()) {
            System.out.println("aaa");
        }
    }

}
