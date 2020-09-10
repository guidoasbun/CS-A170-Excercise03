/* 
*   Guido Asbun
*   Jaeseok Heo
*   CS A170 
*   09-September-2020     
* 
*   Exercise 03
*/ 

import java.util.Scanner;

public class MathSkills
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter THREE numbers and I will show you my math skills");
        
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        
        System.out.println("Check this out:");
        System.out.println(numberOne + " + " + numberTwo + " - " + numberThree + " = " + (numberOne+numberTwo-numberThree));
        
        System.out.println("Numbers I entered" + numberOne + numberTwo + numberThree);
        
    }
}