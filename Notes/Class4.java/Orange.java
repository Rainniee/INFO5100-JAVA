/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

public class Orange extends Fruit{
    
    private float juiceLevels;
    public float getJuiceLevels(){
        return juiceLevels;
    }
    public void setJuiceLevels(float juiceLevels){
        this.juiceLevels = juiceLevels;
    }
    
    public Orange(){
        
    }
    public Orange(int price, String color, float weight, int expiry){
        super(price, color, weight, expiry);
    }
    
    public void eat(){
        System.out.println("Eating Orange");
    }
    
    @Override
    public float getDiscount(){
        return 0;
    }
	
}
