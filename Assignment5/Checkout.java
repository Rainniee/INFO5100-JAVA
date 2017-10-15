/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dessertshoppe;

import java.text.DecimalFormat;
import java.util.Vector;

/**
 *
 * @author apple
 */
public class Checkout {
    private DessertShoppe DessertShoppe = new DessertShoppe();
    private Vector DessertItemList = new Vector(); // Use a Vector to store the DessertItem's.
    
    public Checkout(){
    }
    
    public void enterItem(DessertItem item){
        DessertItemList.add(item);
    }
    
    public void clear(){
        DessertItemList.removeAllElements();
    }
    
    public int numberOfItems(){
        return DessertItemList.size();
    }
    
    public int totalCost(){
        int totalCost = 0;
        for (int i = 0; i < DessertItemList.size(); i++){
            totalCost += DessertItemList.get(i).getCost();
        }
        return totalCost;
    }
    
    public int totalTax(){
        return (int)Math.round(totalCost() * DessertShoppe.getRate());
    }
    
    public String toString()
    {
        // create the receipt header
        int Total = totalCost() + totalTax();
        String output = "";
        output += "Number of Items: " + numberOfItems() + "\n\n";
        output += "Total cost: " + totalCost() + "\n\n";
        output += "Total tax: " + totalTax() + "\n\n";
        output += "Cost + Tax: " + Total + "\n\n";
        
        output += DessertShoppe.shoppeName + "\n";
        output += "--------------------\n";

        // list all the desserts ordered
        int preCost = 0;
        for(int i=0; i < numberOfItems(); i++)
        {
            output += DessertItemList.get(i) + "\n";
            preCost += DessertItemList.get(i).getCost();
        }
        output += "\n";
        
        // calculate the taxes
        // format the spacing for the tax amount
        // we subtract 3 because of the 3 letters in Tax
        output += "Tax";
        double Ftax = DessertShoppe.cents2dollarsAndCents(totalTax());
        int widthTax = DessertShoppe.widthOfReceipt - 3;
        output += String.format("%" + widthTax + "s%n", Ftax);
        
        // calculate the total cost       
        // format the total
        // Subtract 5 because of the 5 letters in total
        output += "Total Cost";
        double Ftotal = DessertShoppe.cents2dollarsAndCents(Total);        
        int widthTotal = DessertShoppe.widthOfReceipt - 5;
        output += String.format("%" + widthTotal + "s%n", Ftotal);
        return output;
    }
}

