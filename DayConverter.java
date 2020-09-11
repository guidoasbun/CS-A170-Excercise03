/* 
*   
*   
*   CS A170 
*   09-September-2020     
* 
*   Exercise 03
*/ 

import java.util.Scanner;

public class DayConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number of days: ");
        int days = input.nextInt();
        int hours = days * 24;
        int minutes = days * 1440;
        int seconds = days * 86400;
        
        System.out.println(days + " days is " + hours 
            + " hours or " + minutes + " minutes or " + seconds 
            + " seconds");
        
    }
}