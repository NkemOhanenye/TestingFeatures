package FunctionTests;/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/3/17
 * Time: 4:42 PM
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Writer{

    private String directory;
    private String path = "./Resources";
    private String words;
    private String fileName;
    private String fileType = ".txt";
    private File file;
    private Boolean dupe = true;
    private FileOutputStream fos;
    private ArrayList<Double> arry;

    public void create(String fileName)
            throws FileNotFoundException, IOException{

        directory = path + "/" + fileName + fileType;
        file = new File(directory);
        this.fileName = fileName;
        fileName = this.fileName;
        if(!file.exists()){
            file.createNewFile();
        }

    }
    public boolean exist(){
        return file.exists();
    }

    public void write(String words) throws FileNotFoundException, IOException{

        fos = new FileOutputStream(file, dupe);
        PrintStream MakeWriter = new PrintStream(fos);
        MakeWriter.println(words);
        this.words = words;
        MakeWriter.close();
        fos.close();

    }

    public ArrayList<Double> read() throws FileNotFoundException{
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
    private static String replaceBrackets(String string){
        return string
                .replace(",", "")
                .replace("[", "")
                .replace("]","")
                .trim();
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getDirectory() {
        return directory;
    }

    public void setFos(File f, boolean boo) {
        this.file = f;
        this.dupe = boo;
    }

    public FileOutputStream getFos() {
        return fos;
    }

    public String getWords() {
        return words;
    }
}
