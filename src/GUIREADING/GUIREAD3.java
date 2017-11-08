package GUIREADING;/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 10/4/17
 * Time: 5:39 PM
 */

/**
 * DISCONTINUED
 */

import javax.swing.*;
import java.util.*;
import java.io.*;

public class GUIREAD3 extends JFrame{

    private int itemId;
    private String itemName;
    private String itemShelve;
    private String itemCode;

    public GUIREAD3() throws FileNotFoundException{
        Scanner fScn = new Scanner(new File("items.txt"));
        String data;

        while( fScn.hasNextLine() ){
            data = fScn.nextLine();

            String[] token = data.split(" ");
            itemId = Integer.parseInt(token[0]);
            itemName= token[1];
            itemShelve = token[2];
            itemCode = token[3];
        }
        fScn.close();
    }
    public static void main(String args[]) throws FileNotFoundException{
        new GUIREAD3();
    }
}