/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class Demo2 {
    public static void main(String[] args) {
       List<String> name = new ArrayList<String>(); 
       // arrayList : thứ tự 
       name.add("Tuan"); //  
       name.add("Hanh"); // 
       name.add("Phuong");
       name.add("Hang");
       
       name.set(1,"Khanh");// 
       name.remove("Phuong"); 
       //name.remove(2);

        System.out.println(name.toString());
    }
    
    
}
