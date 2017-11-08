/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/6/17
 * Time: 8:02 AM
 */
package FunctionTests;

public class AddTest {
    public static void main (String args[]){
        Add sum = new Add();
        int a = sum.add(5, 10);
        System.out.println(a);
    }
}