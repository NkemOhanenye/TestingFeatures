/*
 * Created by IntelliJ IDEA.
 * User: otakusenseihig
 * Date: 11/3/17
 * Time: 4:44 PM
 */

import java.io.FileNotFoundException;

/**
 * Broken - output is incorrect
 */

public class WriterTest {

    public static void main(String args[]) throws FileNotFoundException{
        Writer writer = new Writer();
        writer.Writer("Kimi ga Yume wo Tsuretekita", "Ore wa Teppei", "./Resources","write");
    }
}