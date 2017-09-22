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
    

