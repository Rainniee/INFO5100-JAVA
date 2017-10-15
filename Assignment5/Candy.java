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
public class Candy extends DessertItem{
    /**
     * @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    **/
    private double weight;
    private int pricePerPound;
    
    public Candy(){
    }
    public Candy(String name, double weight, int pricePerPound){
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }
    
    @Override
    public int getCost(){
        return (int)Math.round(weight * pricePerPound);
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setPricePerPound(int pricePerPound){
        this.pricePerPound = pricePerPound;
    }
    public int getPricePerPound(){
        return pricePerPound;
    }
    
}
