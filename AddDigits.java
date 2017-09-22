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
