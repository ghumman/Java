/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Basic {
    
    private double dFirstInput, dSecondInput;
    public Basic(){
        // Set up input scanner
        Scanner sUserInput = new Scanner(System.in);
        
        // Let's do some addition
        System.out.println("Let us do some addition");
        System.out.println("Please enter 1st number");
        dFirstInput = sUserInput.nextDouble();
        System.out.println("Please enter 2nd number");
        dSecondInput = sUserInput.nextDouble();
        
        System.out.println(dFirstInput + " " + " + " + 
                dSecondInput + " = " +
                (dFirstInput + dSecondInput));
        
        // Let's do some subtraction
        System.out.println("Let's do some subtraction");
        System.out.println("Please enter 1st number");
        dFirstInput = sUserInput.nextDouble();
        System.out.println("Please enter 2nd number");
        dSecondInput = sUserInput.nextDouble();
        System.out.println(dFirstInput + " - " 
            + dSecondInput + " = " + 
                (dFirstInput - dSecondInput));
        
        // Let us do some multiplication
        System.out.println(
                "Let us do some multiplication.\n"
                + "Please enter first number");
        dFirstInput = sUserInput.nextDouble();
        System.out.println("Please enter second number");
        dSecondInput = sUserInput.nextDouble();
        // output results
        System.out.println(dFirstInput + " * " +
            dSecondInput + " = " + 
                (dFirstInput * dSecondInput));
        
                
        //Let us do some Division
        System.out.println("Let's do some division\n"
                + "Please entekr 1st number");
        dFirstInput = sUserInput.nextDouble();
        System.out.println("Please enter 2nd number");
        dSecondInput = sUserInput.nextDouble();
        
        System.out.println(dFirstInput + " / " +
                dSecondInput + " = " + 
                (dFirstInput / dSecondInput));
        
        
        // Let us do modulus
        System.out.println("Let us do modulus\n"
                + "Please enter 1st number");
        dFirstInput = sUserInput.nextDouble();
        System.out.println("Please enter 2nd number");
        dSecondInput = sUserInput.nextDouble();
        
        System.out.println(dFirstInput + " % " +
                dSecondInput + " = " + 
                (dFirstInput % dSecondInput));
        
        
    }
    
    public void JobDone(){
        System.out.println("Basic calculations are completed.");
    }
    
}
