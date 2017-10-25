/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

public class Fruit extends Thing {
    
    protected int price;
    private String color;
    private float weight;
    private int expiryTimeInDays;
    
    public void eat(){
        System.out.println("Eat Fruit");
    }
    
    protected void getCleaned(){
        
    }
    
    public float getDiscount(){
        if (expiryTimeInDays <= 2){
            return 0.25f;
        }
        else{
            return 0f;
        }
    }
    
    protected Fruit(int price, String color, float weight, int expiryTimeInDays){
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.expiryTimeInDays = expiryTimeInDays;
    }

    public Fruit(){
        this(1, "red", (100), 7);
    }
    
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
   
    public int getExpiryTimeInDays(){
        return expiryTimeInDays;
    }
    public void setExpiryTimeInDays(int expiryTimeInDays){
        this.expiryTimeInDays = expiryTimeInDays;
    }
    
    public String toString(){
        return "Friut [Price, color, weight, expiryTime] = [" + price + ", " + color + ", " + weight + ", " + expiryTimeInDays + "]";
    }
    
}
