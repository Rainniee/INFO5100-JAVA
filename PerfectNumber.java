/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution2;
import java.util.Scanner;
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
