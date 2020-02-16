/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author minhdq
 */
public class Mapentry {
     public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        // add elements to map
        map.put(1, "C");
        map.put(3, "C++");
        map.put(2, "Java");
        map.put(4, ".net");
        
        // show map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
