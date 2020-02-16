/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author minhdq
 */

public class Demo1 {
    public static void main(String[] args) {
//        List list1 = new ArrayList();
        List<Integer> list = new ArrayList<>();
        list.add(11);//0
        list.add(2);//1
        list.add(2);//2
        Set<Integer> set = new HashSet<Integer>();
        set.add(100);
        set.add(200);
        set.add(200);
        
        list.addAll(set);
        System.out.println(list.toString());
        set.addAll(list);
        System.out.println(set.toString());

    }
}
