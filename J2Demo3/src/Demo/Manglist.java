/*
 * Sử dụng Arrays.asList():
 */
package Demo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class Manglist {

    public static void main(String[] args) {
        // create new array
        String[] arr = {"Java", "C++", "PHP", "Python"};
        // convert array to List
        List<String> list = Arrays.asList(arr);
        // show list
        for (String s : list) {
            System.out.println(s);
        }

    }
}
