/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobb1357;

import class302.*;
import demo1_2.*;
import j2demo1.*;

/**
 *
 * @author minhdq
 */
public class Fish extends Animal{
    
        public Fish(String name, int weight, int high) {
            super(name, weight, high);
        }
    
        @Override
        public void move(){
            System.out.println("Di chuyển : Bơi"); // bò, bay, nhẩy, bơi ...
        }   

    @Override
    public String eat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }

