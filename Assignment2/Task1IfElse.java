/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Task1IfElse {

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
        if(m == 1 || m == 3 || m == 5 ||m == 7|| m == 8 || m == 10 || m == 12){
            numberDays = 31;
        }
        else  if (m == 4 || m == 6 || m == 9 || m == 11){
            numberDays = 30;
        
        } else if (m ==2){
            //boolean isLeapYear =( (y % 4 == 0) && (y %100 != 0) || (y % 400 == 0) ); //when it is TRUE
            if(y %4==0){                                                     //if the condition is true, then It is a leap year, so it has 29 days
                numberDays =29;
            }
            else {                                                              //if the condition is false, then It is a common year, so it has 28 days
                numberDays=28;
            }
        }return numberDays;
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
