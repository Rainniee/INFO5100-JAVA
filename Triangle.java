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
    