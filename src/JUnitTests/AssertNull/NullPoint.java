/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 3:47 PM
 */
package JUnitTests.AssertNull;

import java.util.ArrayList;

public class NullPoint {
    public static ArrayList initializer(int a){
        ArrayList list;
        if(a == 0){
            list = new ArrayList<>();
        } else {
            list = null;
        }
        return list;
    }
}