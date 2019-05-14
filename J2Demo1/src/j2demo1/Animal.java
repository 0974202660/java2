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
public class Animal {
    // trường / thuộc tính
    private String name;
    private int weight;
    private int high;

    public Animal(String name, int weight, int high) {
        this.name = name;
        this.weight = weight;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    
    
    
    
    public void showInfo(){
        
        System.out.println("Name\t : "+this.getName());
        System.out.println("High\t : "+this.getHigh());
        System.out.println("Weight\t : "+this.getWeight());
        
        System.out.println("");
    }
    public void eat(){
        System.out.println("Động vật ăn thịt !");
    }
    public void move(){
        System.out.println("Di chuyển : Đi, chạy"); // bò, bay, nhẩy, bơi ...
    }
}
