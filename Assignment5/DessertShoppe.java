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
public class DessertShoppe {

    /**
     * @param args the command line arguments
     */
    
    private static final String shoppeName = "M & M Dessert Shoppe";
    private static final double taxRate = 0.065;// taxRate = 87/1331
    private static int maxOfItemName = 20;
    private static int widthOfReceipt = 38;
    public static String getShoppeName(){
        return shoppeName;
    }
    public static double getRate(){
        return taxRate;
    }
    public static int getMaxOfItemName(){
        return maxOfItemName;
    }
    public static int getWidthOfReceipt(){
        return widthOfReceipt;
    }
    
    public double cents2dollarsAndCents(int cents){
        return cents / (double)100;
    }
    
}
