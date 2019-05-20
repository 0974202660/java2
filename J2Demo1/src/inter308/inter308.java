/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter308;

/**
 *
 * @author minhdq
 */
public class inter308 implements giaCam{
    public static void main(String[] args) {
        inter308 duck = new inter308();
        duck.bay();
        duck.eat();
    }

    @Override
    public void bay() {
        System.out.println("gà vịt bay đc");
    }

    @Override
    public void eat() {
        System.out.println("động vật ăn");
    }

    @Override
    public void nguTrenCay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void biThit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
