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
public class EvenThread extends Thread{
//In ra cac so chan tu 1 den 10
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Even Thread: "+i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
    
}
