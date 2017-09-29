/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Calculator {

    private double[] equation;
    private double value;
    public Calculator (){
        
    }
    public Calculator(double firstnum, String s, double secondnum ){
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
    
    public Calculator(double a, double b, double c){
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
            double k = Math.sqrt(b * b - 4 * a * c);
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
