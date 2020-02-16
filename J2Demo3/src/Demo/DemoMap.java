/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.RowFilter.Entry;

/**
 *
 * @author minhdq
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String, Double> map=new HashMap<String, Double>();
        
        //bo sung 4 cap vao tap hop
        map.put("Nokia", 500.0);
        map.put("Samsung", 600.99);
        map.put("Motorola", 399.99);
        map.put("Sony Ericson", 400.50);
        map.put("Motorola", 399.99);
        map.put("Sony Ericson", 400.50);
        //cap nhat gia tri co khoa la samsung
        map.put("Samsung", 555.55);
        System.out.println(map.toString());
       
//        Set <String> key=map.keySet();
//        for(String k:key)
//        {
//            Double diem=map.get(k);
//        }
//        System.out.println(map.toString());
        
       // for(Entry <String,Double> entry: map.entrySet())
       // {
           // String ten=entry.getKey();
          //  double diem=entry.getValue();
       // }
       }
   
}
