package FunctionTests;
/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 11/3/17
 * Time: 4:42 PM
 */

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Writer{

    private static String directory;
    //private static String path = "./Resources";
    private static String words;
    private static String fileName;
    private static String fileType = ".txt";
    private static File file;
    private static FileOutputStream fos;
    private static ArrayList<Double> arry;

    public static void create(String path, String name)
            throws FileNotFoundException, IOException{

        directory = path + "/" + name + fileType;
        file = new File(directory);
        fileName = name;
        if(!file.exists()){
            file.createNewFile();
        }

    }
    public static boolean exist(){
        return file.exists();
    }

    public static void write(String word) throws FileNotFoundException, IOException{

        fos = new FileOutputStream(file, true);
        PrintStream MakeWriter = new PrintStream(fos);
        MakeWriter.println(words);
        words = word;

        MakeWriter.close();
        fos.close();

    }

    public static ArrayList<Double> read() throws FileNotFoundException{
        NumberFormat formatter = new DecimalFormat("#.00");
        arry = new ArrayList<Double>();
        Scanner scnr = new Scanner(new File(directory));
        while(scnr.hasNextLine()){
            String s = scnr.nextLine();
            String[] splitStr = s.split(",");
            for (String num : splitStr) {
                arry.add(Double.parseDouble(num));
            }
        }
        return arry;
    }

    public String getFileName() {
        return fileName;
    }

    /*public String getPath() {
        return path;
    }*/

    public String getDirectory() {
        return directory;
    }

    public String getWords() {
        return words;
    }
}
