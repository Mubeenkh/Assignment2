/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("How many random values do you want: ");
        int n = input.nextInt();
        
        System.out.println("Sum of Random numbers: " + calAverageScore(n));
        
        
    }
    public static double calAverageScore(int n) {
        
        Random rand = new Random();
        int devide =0;
        int sum = 0;                    //sum starts off as 0 
        
        for (int i = 1 ; i <= n ;i++){
            //u only want n amount of random numbers
            int randNum = rand.nextInt(100);                    //u only want random numbers between 0 and 100
            System.out.println("Randomt number: " + randNum);   //outputs the random number
            
            if(randNum > 40){   //if Randomnumber > 40 then you do not include it in the sum of all random numbers
                sum += randNum;
                //Ex: sum += randomNubers; 
                //If we choose to have 3 random numbers (56 , 70 , 82)
                //first loop:       0 += 56; --> sum becomes 0 + 56 = 56
                //second loop:      56 += 70; --> sum becomes 56 + 70 = 126
                //third/final loop: 126 += 82; --> sum becomes 126 + 82 = 208
                
                devide++; // each time u do the loop, it adds 1 to devide( which is 0)
                
            }    
        }
        double sumOfVaues = sum /devide;
        return sumOfVaues;
    }
    
}
