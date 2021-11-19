/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4switchcase;

import java.util.Scanner;

/**
 *
 * @author mubeen
 */
public class Task4SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //input number score
        System.out.println("Input your score: ");
        int score = input.nextInt();
        //turns number score into letter score
        char letter_Score = toLetterScore(score);
        System.out.println("Your Letter Score is:    "+letter_Score);
        
        printMessage(letter_Score);//execute the printMessage method
        
    }
    public static char toLetterScore(double s){
        char letter=0;    
        
        if( s <= 100 && s >=90){
            letter = 'A';
        }
        else if( s < 90 && s >=80){
            letter = 'B';
        }
        else if( s < 80 && s >=70){
            letter = 'C';
        }
        else if( s < 70 && s >=60){
            letter = 'D';
        }
        else if( s < 60 && s >=0){
            letter = 'F';
        }    
        return letter;
    }
    public static void printMessage(char letterScore){
        //takes number score and output a message
        
        switch (letterScore){
            case 'A':
                System.out.println("Exellent");
                break;
            case 'B':
                System.out.println("Exellent");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':    
                System.out.println("Better Try Again");  
                break;
        }
       
    }
    
    
}
