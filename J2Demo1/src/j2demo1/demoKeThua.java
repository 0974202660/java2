/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo1;


/**
 *
 * @author minhdq
 */
public class demoKeThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello Java2 !");
        
//        Animal dongVat = new Animal("ăn tiền", 50, 165);
//        dongVat.showInfo();
//        dongVat.eat();
//        dongVat.move();
//        System.out.println("=========");
//        
//        Duck conVit = new Duck(10, 3, "vịt người", 30, 155);
//        conVit.showInfo();
//        conVit.move();
//        conVit.eat();
//        System.out.println("============");
//        
//        Fish conCa = new Fish("cá hổ", 2, 3);
//        conCa.move();
//        System.out.println("-------------");
        
        Duck conVat = new Duck(2, 2, "vit chúa", 23, 32);
        System.out.println("Tên\t\tCân nặng\tCao\tĐuôi\tChân\tHình dáng\tThức ăn\t\t\tDi chuyển");
        System.out.println(conVat.showInfo());
       
        
//        Fish conCa = new Fish("cá con", 1, 1);
//        System.out.println(conCa.showInfo());
//        System.out.print("Hình Dáng : " + conCa.hinhDang());
        
        
    }
    
}
