/**
 * Created by otakusenseihig on 2/17/17.
 */
import java.util.Scanner;
public class Test1 {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        double unitPrice, quantity, total;

        unitPrice = keyboard.nextDouble();
        quantity = keyboard.nextInt();

        total = unitPrice * quantity;

        System.out.println(total);

        keyboard.close();
    }
}
