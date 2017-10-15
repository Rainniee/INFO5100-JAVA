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
public class IceCream extends DessertItem{

    /**
    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    **/
    private int cost;
    
    public IceCream(){
    }
    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }
    
    @Override
    public int getCost() {
	return cost;
    }
}
