/**1. Write a java function to calculate the salary of an employee based on the following rules.
    i. function takes input of number of hours an employee worked and returns the salary.
    ii.  The first 36 hours worked are paid at a rate of 15.0,
     then the next 5 hours are paid at a rate of 15 * 1.5.
     Hours after that up to a max of 48 are paid at a rate of 15 * 2.**/

package solution2;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class EmployeeSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter employee's working hours: ");
        int hours = in.nextInt();
        employeeSalary(hours);   
        // TODO code application logic here
    }
    
     public static double employeeSalary(double hours){
        double employeeSalary;
	double basicSalary;
	double overtimeSalary;
        
        if (hours <= 36) {
	    employeeSalary = hours * 15;
	}
        else if ((hours > 36) && (hours <= 41)) { 
		basicSalary = 36 * 15;
		overtimeSalary = (hours - 36) * 15 * 1.5;
		employeeSalary = basicSalary + overtimeSalary;
	}
        else {
	    // (hours > 41) && (hours <= 48)
		basicSalary = 36 * 15 + 5 * 15 * 1.5;
		overtimeSalary = (hours - 41) * 15 *2;
		employeeSalary = basicSalary + overtimeSalary;
	}
        System.out.println ("The salary of this employee " + "= " + employeeSalary);
	return employeeSalary;
    }
}


/**2. Write a java function that adds all the digits of an integer until it is single digit.
    i. function takes an integer as input and returns its sum of digits.
    ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.**/

/**
 *
 * @author apple
 */
public class AddDigits {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input an integer:");
        int input = in.nextInt();
        addDigits(input); 
    }
    
    public static int addDigits (int input) {
        int sum = 0;
        while (input > 0) {
	    sum += input % 10;
		input = input /10;
	}
	//sum = (sum < 10) ? sum : addDigits(sum);
	System.out.println("sum = " + sum);
	return sum;
    }
}


/**3. Write a java function to print all perfect number between 1 and n.
    i. Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    ii. For example: 6 is the first perfect number, Proper divisors of 6 are 1, 2, 3.
     Sum of its proper divisors = 1 + 2 + 3 = 6.**/

/**
 *
 * @author apple
 */
public class PerfectNumber {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the range n: ");
        int n = in.nextInt();
        printPerfectNumbers(n);    
// TODO code application logic here
    }
    
    public static void printPerfectNumbers(int n) {
        if (n <= 1) {
	    System.out.println("\n There is no perfect number.");
        }
        else {
            System.out.println("\n The perfect numbers between 1 and " + n + " are: ");
	    for (int i = 1; i < n; i++) {
	        int sum = 0;
		    { 
		        for (int j = 1; j < i; j++) {
			        if (i % j == 0) {
				        sum = sum + j;
				    }
			    }
			    if (sum == i) {
			        System.out.println(i);
                            }
                    }
            }
        }
    } 
}


/**4. Write a java class called pizza with (Add detail as needed) :
     i. Create at least 3 attributes :pizza type , unit price and loyalty points. More attributes are welcome to have.
     ii. Create constructors . Extra-credit of 0.5 point if you write more than 1 right constructor to this class**/

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


 /**5. Write a java class called customer (Add detail as needed) :
     i. Create Attributes: customer name and which pizzas customer has ordered.
     ii. Think about what kind of data structure can be used to record the pizza name and number of each kind of pizza.( Give me your thought, Extra credit of 1 point)
     iii. In main method , sum up how much money the customer spent.**/

/**I think to solve this problem, we'd better use a collection that acts like a property list, where we can give it a pizza name and the number associated with that pizza name. 
Since each element in a Map is actually 2 objects: a key and a value, so I choose HashMap to be the right data structure, to record the pizza name and number of each kind of pizza. 
Let pizza name be the key (which cannot duplicate), and let the number of each kind of pizza be the value(since we can have duplicate values).**/

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


// EXTRA CREDIT
     /**6. Write a Java program that generates an isosceles right angled triangle made of asterisks.
     i. function should take input of one equal side as integer. Other than the edges the inner part of the triangle should be empty.
     ii. For example input is 6. the function should print—
     *
     **
     * *
     *  *
     *   *
     ******/

/**
 *
 * @author apple
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
	int n = in.nextInt();
	printIsoscelesTriangle(n);    
    }
    
    public static void printIsoscelesTriangle(int n){
        if (n < 1) {
	    System.out.println("The input must be a positive integer, please enter another number: ");
	}
	for (int i=1; i<=n; i++) {
            if (i != n) {
                for (int j=1; j<=i; j++) {
                    if (j == 1) 
			System.out.print("*");
                    else if (j==i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.print("\n");
                
            }
            else { // (i==n)
                for (int m=1; m<=n; m++) {
                    System.out.print("*");
                }
            }
        }
    }
}
