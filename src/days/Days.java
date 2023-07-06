/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import days.Weekdays.Day;
import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 */
public class Days {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the day number ");
    int code = in.nextInt();
    if(code<1 || code>7){
        System.out.println("Invalid input, Please Enter again\n");
    }
    else{
    Weekdays t= new Weekdays();
    Day x = Day.values()[code-1];
    t.nameOfDay(x); 
    }// TODO code application logic here
    }
    
}
