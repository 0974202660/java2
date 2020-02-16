/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author minhdq
 */
//  java.lang
public class StudentSort1 implements Comparable<StudentSort1>{
    public String name;
    public Double mark;

    public StudentSort1(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo (StudentSort1 other)
// so sanh doi tuong hien tai vs doi tuong dc chi dinh
            // cần phải cài đặt tiêu chí để so sánh
    {
        return (mark.compareTo(other.mark));
    }
    public static void main(String[] args) {
         List<StudentSort1> list=new ArrayList<>();
        list.add(new StudentSort1("Thích",5.0));
        list.add(new StudentSort1("Là",7.0));
        list.add(new StudentSort1("Nhích",6.0));
        Collections.sort(list);
         for(StudentSort1 sv: list)
        {
            System.out.println(sv.name +" ,"+ sv.mark);
        }
        
    }
}
