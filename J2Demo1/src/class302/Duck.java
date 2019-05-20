/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class302;

import demo1_2.*;
import j2demo1.*;

/**
 *
 * @author minhdq
 */
public class Duck extends Animal{
    private int tail;
    private int legs;// thuộc tính, trường

    public Duck(int tail, int legs, String name, int weight, int high) {
        super(name, weight, high);
        this.tail = tail;
        this.legs = legs;
    }
    
    
    @Override
    public void showInfo(){
        System.out.println("Tail\t : "+this.getTail());
        System.out.println("Legs\t : "+this.getLegs());
        super.showInfo();
    }
    
    @Override
    public void eat(){
        System.out.println("Duck Động vật ăn cỏ !");
    }
    @Override
    public void move(){
        //super gọi pthuc lớp cha
        System.out.println("");
        super.move();
        System.out.println(" hoặc bơi, lặn ...");
    }
    
    public void bark(){
        System.out.println("Duck said : Quack quack ...");
    }
    public int getTail() {
        return tail;
    }

    public Duck(String name, int weight, int high) {
        super(name, weight, high);
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    
}
