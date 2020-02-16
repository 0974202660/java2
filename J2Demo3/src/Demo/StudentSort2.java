/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author minhdq
 */
public class StudentSort2 {

    public String name;
    public Double mark;// ? ? ?
    

    public StudentSort2(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
    

    public static void main(String[] args) {
        List<StudentSort2> list = new ArrayList<>();
        list.add(new StudentSort2("Thích", 5.0));
        list.add(new StudentSort2("Là", 7.0));
        list.add(new StudentSort2("Nhích", 6.0));
        // java.util 
        // so sánh đối tượng đầu tiên và đối tượng thứ hai
        Comparator<StudentSort2> com = new Comparator<StudentSort2>() {
            @Override
            public int compare(StudentSort2 o1, StudentSort2 o2) {
               return o2.mark.compareTo(o1.mark);
            }
        } ;
        Collections.sort(list, com);
         for(StudentSort2 sv : list)
        {
            System.out.println(sv.name +" ,"+ sv.mark);
        }
    }
}
