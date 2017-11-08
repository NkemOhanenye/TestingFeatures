package BASICCODE;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by otakusenseihig on 5/4/17.
 */
public class NoDupe {
    public static void main(String args[]){
        Integer[] arr = new Integer[75];
        for (int print = 0; print < arr.length; print++) {
            arr[print] = print;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
