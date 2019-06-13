/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo7;

/**
 *
 * @author minhdq
 */
public class J2Demo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Integer x = 5; // dong hop int thanh doi tuong Integer
      x =  x + 10;   // mo hop Integer thanh int
      System.out.println(x); 
      
      Double y = new Double(23.4);
      double yy = y.doubleValue();
        System.out.println(yy);
    }
    public static void main01(String args[]) {
        // Đổi int thành Integer
        int a = 20;
        Integer i = Integer.valueOf(a);// đổi int thành Integer
        Integer j = a;// autoboxing, 
        //tự động đổi int thành Integer trong nội bộ trình biên dịch
 
        System.out.println(a + " " + i + " " + j);
    }
    public static void main02(String args[]) {
        // đổi Integer thành int
        Integer a = new Integer(3);
        int i = a.intValue();// đổi Integer thành int
        int j = a;// unboxing, 
        //tự động đổi Integer thành int trong nội bộ trình biên dịch
 
        System.out.println(a + " " + i + " " + j);
    }
    
    
}
