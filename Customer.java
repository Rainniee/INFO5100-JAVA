
 /**5. Write a java class called customer (Add detail as needed) :
     i. Create Attributes: customer name and which pizzas customer has ordered.
     ii. Think about what kind of data structure can be used to record the pizza name and number of each kind of pizza.( Give me your thought, Extra credit of 1 point)
     iii. In main method , sum up how much money the customer spent.**/

/**I think to solve this problem, we'd better use a collection that acts like a property list, where we can give it a pizza name and the number associated with that pizza name. 
Since each element in a Map is actually 2 objects: a key and a value, so I choose HashMap to be the right data structure, to record the pizza name and number of each kind of pizza. 
Let pizza name be the key (which cannot duplicate), and let the number of each kind of pizza be the value(since we can have duplicate values).**/

package solution2;
import static com.sun.jmx.remote.internal.IIOPHelper.isAvailable;
import java.util.*;
import java.util.HashMap;
import static sun.security.ssl.Krb5Helper.isAvailable;
import static sun.util.logging.LoggingSupport.isAvailable;
/**
 *
 * @author apple
 */
public class Customer {
    String name;
    HashMap <pizzaName, number> pizzas;
    Customer(String name, HashMap<pizzaName, number> pizzas){
    this.name = name;
    this.pizzas = pizzas;
    }
    
    Customer(){
        name = "Rainnie";
        HashMap <pizzaName, number> pizzas = new HashMap <pizzaName, number> ();
        pizzas.put("Beef,0");
        pizzas.put("BBQ,0");
	pizzas.put("Cheese,0");
	pizzas.put("Friuts,0");
    }
    
    public double orderPizza(String type, int size, int number){
        Pizza pizza = new Pizza (type, size, number);
	if(pizza.type isAvailable){
            if(pizzas.containsKey(pizza)){
                number += pizzas.get(pizza);
            }
    }
        System.out.println("Your ordered pizzaName and number are: " + pizzas);
	double orderPayment = 0;
	orderPayment += pizza.unitprice * pizza.pizzaSize * pizzas.get(pizza);
	System.out.println("Your total payment is: " + orderPayment);
	return orderPayment;
    }

    private static class number {

        public number() {
        }
    }

    private static class pizzaName {

        public pizzaName() {
        }
    }
}
