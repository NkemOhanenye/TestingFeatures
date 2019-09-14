/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/28/17
 * Time: 3:24 PM
 */
package BASICCODE;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String args[]){
        ArrayList<Double> arry = new ArrayList<Double>();
        arry.add(10.0);
        arry.add(20.0);
        arry.add(20.0);
        arry.add(20.0);
        System.out.println(replaceBrackets(arry.toString()));
        ArrayList<Double> arry2 = new ArrayList<Double>();
        for (double i = 0; i < 10; i++){
            arry2.add(i);
            System.out.println(arry2);
        }
    }
    private static String replaceBrackets(String string){
        return string
                .replace(",", "")
                .replace("[", "")
                .replace("]","")
                .trim();
    }
}