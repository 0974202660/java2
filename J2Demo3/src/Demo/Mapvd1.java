/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author minhdq
 */
public class Mapvd1 {
     public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "A");
        map.put(103, "B");
        map.put(102, "C");

        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
