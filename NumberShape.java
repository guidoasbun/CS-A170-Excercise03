/* 
*   Guido Asbun
*   Jaeseok Heo
*   CS A170 
*   09-September-2020     
* 
*   Exercise 03
*/ 

import java.util.Scanner;

public class NumberShape
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a single-digit number: ");
        int inputNumber = input.nextInt();
        
        System.out.println("   " + inputNumber);
        System.out.println("  " + inputNumber + " " +inputNumber);
        System.out.println(" " + inputNumber + inputNumber + " " + inputNumber + inputNumber);
        System.out.println("" + inputNumber + inputNumber + " " + inputNumber + " " + inputNumber + inputNumber);
    }
}