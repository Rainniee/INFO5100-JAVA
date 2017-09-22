/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution2;
import java.util.*;

/**
 *
 * @author apple
 */
public class Pizza {
    String pizzaType;
    double unitPrice;
    int loyaltyPoints;
    int pizzaSize;
    int orderNumber;
    double totalPrice;
    
    Pizza(String type, int size, int number) {
        pizzaType = type;
	pizzaSize = size;
	orderNumber = number;
	switch (type) {
            case "Feast":
                System.out.println("You choose the Feast Pizza: ");
                unitPrice = 4.5;
		loyaltyPoints = 1;
		break;
	    case "DIY":
		System.out.println("You choose the DIY Pizza: ");
		unitPrice = 5.5;
		loyaltyPoints = 1;
		break;
	    case "Others":
		System.out.println("You choose others: ");
		unitPrice = 5;
		loyaltyPoints = 1;
		break;
            default:
                System.out.println("You need to choose another type!");
        }
        if (loyaltyPoints > 0) {
            totalPrice = unitPrice * pizzaSize * orderNumber;
	    loyaltyPoints += 1;
        }
        else {
            System.out.println("Please contact us for details!");
        }
    }
       
        Pizza() {
            pizzaType = "DIY";
            pizzaSize = 1;
            orderNumber = 2;
            loyaltyPoints = 10;
        } 
}
     
        
      
    

