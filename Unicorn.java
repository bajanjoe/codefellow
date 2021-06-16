/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eastbound.interview;

/**
 *
 * @author damien
 */
public class Unicorn {
    
    String name;
    String color;
    String food;
    String location;
    
    public Unicorn(String name, String color, String food, String location){
        this.name = name;
        this.color = color;
        this.food = food;
        this.location = location;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
      public void setColor(String color){
        this.color = color;
    }
      
          
      public void setFood(String food){
        this.food = food;
    }
      
          
      public void setlocation(String location){
        this.location = location;
    }
      
      
   
       public String getName(){
        return name;
    }
    
      public String getColor(){
        return color;
    }
      
          
      public String getFood(){
          return food;
    }
      
          
      public String getlocation(){
        return location;
    }
      
      
}
