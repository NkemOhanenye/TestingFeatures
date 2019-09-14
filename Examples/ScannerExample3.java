import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 10/6/17
 * Time: 4:34 PM
 *
 * @Author: thenewboston
 * https://www.youtube.com/watch?v=3RNYUKxAgmw
 */

public class ScannerExample3 {
    private Scanner x;

    public ScannerExample3(){
        openFile();
        readFile();
        closeFile();

    }
    public void openFile(){
        //alternative to throwing FileNotFoundException
        try{
            x = new Scanner(new File("tall.txt"));
        } catch (Exception e){
            System.out.println("could not find file");
        }
    }
    //if file was spaced like [I Like Pie]
    //I = a Like = b Pie = c
    public void readFile(){
        while (x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();
            String d = x.next();

            //spaces and displays contents of file
            System.out.printf("%s %s %s %s\n", a,b,c,d);
        }
    }
    //closes the file
    public void closeFile(){
        x.close();
    }

    public static void main(String args[]){
        new ScannerExample3();
    }

}