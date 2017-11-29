/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/28/17
 * Time: 1:59 PM
 */
package FunctionTests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileArryList {

    public static void main(String args[]) throws FileNotFoundException{

        ArrayList<Double> arry = new ArrayList<Double>();
        Scanner scnr = new Scanner(new File("ArryTest.txt"));
        while(scnr.hasNextLine()){
            String s = scnr.nextLine();
            String[] splitStr = s.split(",");
            for (String num : splitStr) {
                arry.add(Double.parseDouble(num));
            }
            //Double str = Double.parseDouble(s);
            //arry.add(str);
        }
        System.out.println(replaceBrackets(arry.toString())+ "test 3");
    }
    private static String replaceBrackets(String string){
        return string
                .replace(",", "")
                .replace("[", "")
                .replace("]","")
                .trim();
    }
}