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
public class Sundae extends IceCream{
    private String nameOfSundae;
    private int costOfSundae;
    
    public Sundae(){ 
    }
    public Sundae(String name, int cost, String nameOfSundae, int costOfSundae){
        super(name, cost);
        this.nameOfSundae = nameOfSundae;
        this.costOfSundae = costOfSundae;
    }
    
    @Override
    public int getCost() {
        return super.getCost() + this.costOfSundae;
    }

    public void setNameOfSundae(String nameOfSundae){
        this.nameOfSundae = nameOfSundae;
    }
    public String getNameOfSundae(){
        return nameOfSundae;
    }
    public void setCostOfSundae(int costOfSundae){
        this.costOfSundae = costOfSundae;
    }
    public int getCostOfSundae(){
        return costOfSundae;
    }  
}