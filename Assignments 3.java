/* Good Work
 * Score 7.5 + extra credit 1; Total score 8.5
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments 3;
import java.util.Scanner;

/**
 *
 * @author apple
 */

//Question 1

public class Book{ // score 1
    int size;
    int price;
    String name;
    public Book(int size){
    this.size = size;
    }
    
    public Book(int size, int price, String name){
        super();// Error 1: There is no father class for this book class. // super can be used as it extends from Object class
        this.size = size;
        this.price = price;
        this.name = name;
    }

    public Book(int price){ //Error 2: These two constructors have the same type(that took only an int), the class wouldn't compile. It's the variable type and order that matters.
        this.price = price;  
    }
    
    public setName(String name){ //Error 3: Maybe change to this sentence will be fine: public void setName(String aName)	  
        return name; //Error 4: Maybe change to this sentence will be fine: name = aName;
    }
}


//Question 2

class Clock{ // score 1
    String time;
    void getTime(){ // Error: the type is wrong, getter() method need a "return" sentence, so if it is "void", there should not have anything return. 
        return time;
    }
    void setTime(String t){
        time = t ;
    }
}


//Question 3

import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = in.next();
        removeVowelsFromString(input);    
// TODO code application logic here
    }
    
    public static String removeVowelsFromString(String input) { // score 1.5, consider upper case also
        String s1;
        s1 = input.replace("a","");
        String s2;
        s2 = s1.replace("e", "");
        String s3;
        s3 = s2.replace("i", "");
        String s4;
        s4 = s3.replace("o", "");
        String s5;
        s5 = s4.replace("u", "");
        System.out.println(s5);
        return s5;
    }
}


//Question4

public class checkIfTwoStringsAreAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String s1 = in.next();
        System.out.println("Please enter the second string: ");
        String s2 = in.next();
		checkIfTwoStringsAreAnagrams c1 = new checkIfTwoStringsAreAnagrams();
		System.out.println(c1.checkIfTwoStringsAreAnagrams(s1,s2));
        // TODO code application logic here
    }
    
    public static boolean checkIfTwoStringsAreAnagrams (String s1, String s2){// score 0, for input "tale","late" the expected
        int n = -1;		// output is true, you function returns false.
        if (s1.length() != s2.length()){
            n++;
        }
        for (int i = 0; i < s1.length(); i++){
            if (s2.contains(s1.substring(i)) == false){ // should work on this logic. 
                n++;
            }
        }
        if (n < 0){
            reture true; // return signature is wrong
        }
        else{
            reture false; // return signature is wrong
    }
}
    

//Question 5

public class Calculator { // score 4 + extra credit 1
    
    /**
     * @param args the command line arguments
     */

    private double[] equation;
    private double value;
    public Calculator (){
        
    }
    public Calculator(double firstnum, String s, double secondnum ){ // don't put too much logic in constructor. define logic in methods and call in constructor
        Scanner input = new Scanner(System.in);
        String operation;
        System.out.println("Please enter your first number: ");  
        firstnum = input.nextDouble();
        System.out.println("Please enter the operation you want to execute: ");
        operation = input.next();
        System.out.println("Please enter your second number: ");  
        secondnum = input.nextDouble();
        
        switch (operation){
            case "+":
                System.out.println("=" + (firstnum + secondnum) );
                break;
            case "-":
                System.out.println("=" + (firstnum - secondnum) );
                break;
            case "*":
                System.out.println("=" + (firstnum * secondnum) );
                break;
            case "/":
                if (secondnum != 0){
                    System.out.println("=" + (firstnum / secondnum) );
                }
                else
                    System.out.println("Please enter a positive second number: ");
                break;
            default:
                System.out.println("Error: Your operation cannot be recongized.");              
        }
    }
    
    public Calculator (double num, String str){
        Scanner input = new Scanner(System.in);
        double output;
        System.out.println("Please enter your number: "); 
        num = input.nextDouble();
        System.out.println("Please enter the operation or transformation you want to execute: ");
        str = input.next();
        
        switch (str){
            case "squareRoot":
                if (num < 0){
                    System.out.println("Please enter a positive number: ");
                }
                else{
                    output = Math.sqrt(num);
                    System.out.println("= " + output);
                }  
                break;
            case "square" :
                output = num * num;
                System.out.println("= " + output);
                break;
            case "cube":
                output = num * num * num;
                System.out.println("= " + output); 
                break;
            case "Fahrenheit":
                output = (num - 32) / 1.8;
                System.out.println("the Celsius is: " + output);  
                break;
            case "Celsius":
                output = num * 1.8 + 32; 
                System.out.println("the Fahrenheit is: "+ output);
                break;
            case "feet":
                output = num * 12;
                System.out.println("the inch = "+ output);
                break;
            case "inch":
                output = num * 0.083;
                System.out.println("the feet = "+ output);
                break;
            default:
                System.out.println("Error: The operation or transformation cannot be recongized!");
        }
    }
    
    public Calculator(double a, double b, double c){ // you have to return the values not print it. extra credit 1
        Scanner input = new Scanner(System.in);
        double value = 0;
        double[] equation = new double[2];
        System.out.println("Please enter your first number: ");  
        a = input.nextDouble();
        System.out.println("Please enter your second number: "); 
        b = input.nextDouble();
        System.out.println("Please enter your third number: ");  
        c = input.nextDouble();
        if (a != 0 && b != 0){
            double k = Math.sqrt(b * b - 4 * a * c); // you have to check a case where delta < 0 and return null or empty array
            double k1 = (-b + k) / (2 * a);
            double k2 = (-b - k) / (2 * a);
            this.equation[0] = k1;
            this.equation[1] = k2;
            System.out.println("the result of this equation is: ");
            for (int i = 0; i < 2; i++){
                System.out.println(equation[i]);
            }
        }
        else if(a == 0 && b != 0){
            this.value = -c / b;
            System.out.println("the result of this equation is:" + value);      
        }
        else if(a == 0 && b == 0)
            System.out.println("Error: The equation cannot be recongized!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator c1 = new Calculator(5,"*",12);
        Calculator c2 = new Calculator(81,"squareRoot");
        Calculator c3 = new Calculator(7,"cube");
        Calculator c4 = new Calculator(75,"Fahrenheit"); 
        Calculator c5 = new Calculator(101,"inch");
        Calculator c6 = new Calculator(7,9,34);
        // TODO code application logic here
    }  
}
