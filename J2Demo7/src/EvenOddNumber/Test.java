/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvenOddNumber;

/**
 *
 * @author minhdq
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        try {
            t1.start();
            t1.join();//Thread t1 ngung hoat dong thi moi den t2
            t2.start();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
