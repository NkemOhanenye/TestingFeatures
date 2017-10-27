/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/27/17
 * Time: 3:48 PM
 */

import java.io.File;
import java.util.Scanner;

public class CSVToInt {

    private Scanner csv;
    private int[] csvI;

    public CSVToInt(){

        try{
            csv = new Scanner(new File("test.csv"));
        } catch (Exception e){
            System.out.println("could not find file");
        }

        while(csv.hasNextLine()) //was .hasNextInt (kept leaving out 1 line)
        {

            String a = csv.nextLine();
            int StrToNum = Integer.parseInt(a.split(",")[0]);
            int StrToNum2 = Integer.parseInt(a.split(",")[1]);
            int StrToNum3 = Integer.parseInt(a.split(",")[2]);
            int StrToNum4 = Integer.parseInt(a.split(",")[3]);
            int StrToNum5 = Integer.parseInt(a.split(",")[4]);
            int StrToNum6 = Integer.parseInt(a.split(",")[5]);
            int StrToNum7 = Integer.parseInt(a.split(",")[6]);
            int StrToNum8 = Integer.parseInt(a.split(",")[7]);
            int StrToNum9 = Integer.parseInt(a.split(",")[8]);
            int StrToNum10 = Integer.parseInt(a.split(",")[9]);
            System.out.println(StrToNum + ", " + StrToNum2 + ", " + StrToNum3 + ", " + StrToNum4 + ", " + StrToNum5  +
                    ", " + StrToNum6 + ", " + StrToNum7 + ", " + StrToNum8 + ", " + StrToNum9 + ", " + StrToNum10);
            //System.out.println(StrToNum + 2); //@Number 2, used to show working int

        }

        csv.close();

    }

    public static void main(String args[]){
        new CSVToInt();
    }
}