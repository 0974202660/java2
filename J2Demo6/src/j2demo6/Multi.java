/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo6;

/**
 *
 * @author minhdq
 */
public class Multi extends Thread{

     @Override
     public void run() {
        System.out.println("thread is running...");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Multi t1 = new Multi();
        t1.start();
        Multi t2 = new Multi();
        t2.start();

    }
    
}
