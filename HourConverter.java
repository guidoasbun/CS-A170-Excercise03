/* 
*   
*   
*   CS A170 
*   09-September-2020     
* 
*   Exercise 03
*/ 

import java.util.Scanner;

public class HourConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number of hours: ");
        int inputHours = input.nextInt();
        int weeks = inputHours / 168;
        int days = (inputHours % 168) / 24;
        int hours = (inputHours % 168) % 24;
        
        
        System.out.println(inputHours + " hours is " + weeks + " weeks " + days + " days, and " + hours + " hours");
        
    }
}