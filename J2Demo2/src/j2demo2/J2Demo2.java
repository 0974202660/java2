/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo2;

/**
 *
 * @author minhdq
 */
public class J2Demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Animal a1= new Animal();
            a1.checkVoice();
       
          Animal a2= new Animal(){
           @Override
           public void checkVoice() {
            System.out.println("chào !");
           }         
       };
       a2.checkVoice();//
       //
       Animal.sayHello();
    }
    
}
