/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Path2;

/**
 *
 * @author minhdq
 */
public class Join extends Thread{
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
 
    public static void main(String args[]) {
        Join t1 = new Join();
        Join t2 = new Join();
        Join t3 = new Join();
        t1.start();
        try {
            t1.join();
//            t1.join(1500);// hoàn thành t1 1500 mili secon thì ms cho t2,3 chay
        } catch (Exception e) {
            System.out.println(e);
        }
 
        t2.start();
        t3.start();
    }

}
