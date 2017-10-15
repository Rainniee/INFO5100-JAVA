/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessertshoppe;

/**
 *
 * @author apple
 */
public class Cookie extends DessertItem{
    /**
     * @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    **/
    private int number;
    private int pricePerDozen;
   
    public Cookie(){
    }
    public Cookie(String name, int number, int pricePerDozen){
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    } 
    
    @Override
    public int getCost(){
        return (int)Math.round(number * pricePerDozen / 12); //4 * 399 / 12 = 133cents
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setPricePerDozen(int pricePerDozen){
        this.pricePerDozen = pricePerDozen;
    }
    public int getPricePerDozen(){
        return pricePerDozen;
    }   
}