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
public class Synchronization {
    public static void main(String args[]) {
        Table obj = new Table();// tao mot object
        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };
 
        t1.start();
        t2.start();

    }

}
class Table {
    void printTable(int n) {// method không synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
 
    }
}

