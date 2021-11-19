/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1switchcase;

import java.util.Scanner;

/**
 *
 * @author mubeen
 */
public class Task1SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);

        System.out.println("Input the month in integer: ");
        int month = Input.nextInt();
        System.out.println("What year is it:");
        int year = Input.nextInt(); 
        
        //method and output
        int days = calcDays(month,year);
        System.out.println("On the month "+month+" of the year "+year+" ,there are " + days + " days");
        boolean leap = isLeapYear(year);
    }
    public static int calcDays(int m, int y){
        int numberDays=0;
        //1 3 5 7 8 10 12
            //4 6 9 11
            //2
        
        switch (m){ 
            case 1:
                numberDays = 31;
                break;
            case 2:
                if( y %4 == 0){                                                     //if the condition is true
                    numberDays = 29;
                }
                else {                                                              //if the condition is false
                    numberDays = 28;
                }
                break;
            case 3:
                numberDays = 31;
                break;
            case 4:
                numberDays = 30;
                break;    
            case 5:
                numberDays = 31;
                break;
            case 6:
                numberDays = 30;
                break;    
            case 7:
                numberDays = 31;
                break;
            case 8:
                numberDays = 31;
                break;
            case 9:
                numberDays = 30;
                break;
            case 10:
                numberDays = 31;
                break;
            case 11:
                numberDays = 30;
                break;    
            case 12:
                numberDays = 31;
                break;    
                
        }
        return numberDays;
        
    }
        
    public static boolean isLeapYear(int y){
        
        //boolean isLeapYear =( (y % 4 == 0) && (y %100 != 0) || (y % 400 == 0) );
        if(y % 4 !=0){
            System.out.println(y + " is a common Year");
        }else if(y % 100 !=0){
            System.out.println(y + " is a Leap Year");
        }else if (y % 400 !=0){    
            System.out.println(y + " is a common Year");
        }else{
            System.out.println(y + " is a Leap Year");
        }
        return false;
        
    }
}  
    

