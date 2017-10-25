/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

public class Apple extends Fruit {
    
    private int hardnessFactor;   
    public int getHardnessFactor(){
        return hardnessFactor;
    }
    public void setHardnessFactor(int hardnessFactor){
        this.hardnessFactor = hardnessFactor;
    }
    
    public Apple(){
        System.out.println("Apple is created");
    }
    public void eat(){    
        
    }
    
    @Override
    public float getDiscount(){
        float x = super.getDiscount();
        if(x != 0){
            return x + 0.10f;
        }
        return x;
    }
    
}
