/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
   public enum Day {
    ONE("Monday"),TWO("Tuesday"),THREE("Wednesday"),FOUR("Thursday"),FIVE("Friday"),SIX("Saturday"),SEVEN("Sunday");

    final String str;

    Day(String str) {
        this.str = str;
    }

    public String getName() {
        return str;
    }
   }
   
   
    public void nameOfDay(Day day) {
        String str = day.getName();
        System.out.println(str);
    }
}
  




