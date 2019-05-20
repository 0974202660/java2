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
public class Fish extends Animal{
    
        public Fish(String name, int weight, int high) {
            super(name, weight, high);
        }
    
        @Override
        public String move(){
            return "Di chuyển : Bơi";
        }   

    @Override
    public String hinhDang() {
         if(getWeight()>2){
            return "To Tướng";
        }else{
            return "Bé Bình Thường";
        }
        
    }

    @Override
    public String eat() {
        
        return "ăn vi sinh vật";
    }
        
    }

