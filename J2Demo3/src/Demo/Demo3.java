/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class Demo3 {
    public static void main(String[] args) {
       List<String> name =new ArrayList<String>(); 
       name.add("Tuan");
       name.add("Hanh");
       name.add("Phuong");
       name.add("Hang");
       
//       name.set(1,"Khanh");
//       name.remove("Phuong");
       //name.remove(2);
        //System.out.println(name.toString());
//        for(int i=0;i<name.size();i++)
//        {
//            String ten=name.get(i);
//            System.out.println(">> Name: "+ ten);
//        }
        for (String xxx:name)//for-each
        {
            System.out.println("Name: "+ xxx);
        }
//        Iterator <String> it=name.iterator();
//        while (it.hasNext())
//        {
//            String ten=it.next();
//            System.out.println(">> Name: "+ten);
//        }
    }
}
