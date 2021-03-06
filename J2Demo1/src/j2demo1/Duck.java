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
public class Duck extends Animal{
    private int tail;
    private int legs;// thuộc tính, trường

    public Duck(int tail, int legs, String name, int weight, int high) {
        super(name, weight, high);
        this.tail = tail;
        this.legs = legs;
    }
    public Duck(String name, int weight, int high) {
        super(name, weight, high);
    }
    
    @Override
    public String showInfo(){
        return super.showInfo() + this.getTail()+"\t"  + this.getLegs()+"\t" + this.hinhDang()+"\t" + this.eat()+"\t" + this.move();
    }
    
    
    @Override
    public String eat(){
        return "Duck Động vật ăn cỏ !";
    }
    @Override
    public String move(){
        //super gọi pthuc lớp cha
        return super.move() + "hoặc bơi, lặn ...";
        
    }
    
    public void bark(){
        System.out.println("Duck said : Quack quack ...");
    }
    public int getTail() {
        return tail;
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

    @Override
    public String hinhDang() {
         if(getWeight()>3){
            return "To Tướng";
        }else{
            return "Bé Bình Thường";
        }
    }

}
