/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in); 
        
        System.out.print("What is you initial Salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter the Number of Years: ");
        int years = input.nextInt();
        
        System.out.printf("\n%s: %.2f\n", "Current Salary", salary);
        System.out.println(calcFutureSalary(salary, years));
    }
    
    public static double calcFutureSalary(double currentSalary, int numYears) {
        
        double salaryInc1 = 1 + (3 / 100);
        double salaryInc2 = 1 + (5 / 100);
        double salaryInc3 = 1 + (8 / 100);

        
        
        if (numYears < 3){
                    
            for (int i = 0 ; i < 3 ; i++){
                currentSalary =currentSalary * salaryInc1;  //whenever i put + it does the calculation but with *, currentSalary stays the same
                System.out.println(currentSalary);
            
            }
        }
        
        else if (numYears >= 3 || numYears < 10){
            for (int i = 0 ; i < 3 ; i++){
                currentSalary =currentSalary * salaryInc1;  //whenever i put + it does the calculation but with *, currentSalary stays the same
                System.out.println(currentSalary);
            } 
            for (int i = 3 ; i >= 3 || i < 10 ; i++){       //this loop runs forever
                currentSalary =currentSalary * salaryInc2;  //whenever i put + it does the calculation but with *, currentSalary stays the same
                System.out.println(currentSalary);
            } 
        }
        else if (numYears >=10){
            for (int i = 0 ; i < 3 ; i++){
                currentSalary =currentSalary * salaryInc1;  //whenever i put + it does the calculation but with *, currentSalary stays the same
                System.out.println(currentSalary);
            } 
            for (int i = 3 ; i >= 3 || i < 10 ; i++){       //this loop runs forever
                currentSalary =currentSalary * salaryInc2;  //whenever i put + it does the calculation but with *, currentSalary stays the same
                System.out.println(currentSalary);
            } 
            for (int i = 10 ; i >= 10 || i < numYears ; i++){       //this loop runs forever
                currentSalary =currentSalary * salaryInc3;  //whenever i put + it does the calculation but with *, currentSalary stays the same
                System.out.println(currentSalary);
            }
        }
        double futurSalary = currentSalary;
        return futurSalary;
    }
}
