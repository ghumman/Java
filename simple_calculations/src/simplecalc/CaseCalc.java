/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author root
 */
public class CaseCalc {
    
    /* Ask user if he wants to do 
    a) Addition, press a or A or +
    b) Subtraction, press s or S or -
    c) Multiplication, press m or M or *
    d) Division, press d or D or / 
    e) Modulus, press r or R or %
    */
    private double dFirOp, dSecOp;
    private char cInputOp, cInputCal; 
    
    
    // default constructor
    public CaseCalc(){
        System.out.println("Hello User!");
    }    // default constructor ends
    
       // constructor with int argument
    public CaseCalc(int start){
        // Set up scanner
        Scanner sUserInput = new Scanner(System.in);
        
        System.out.println("Want to calculate [y/n]?");
        try {
            cInputCal = sUserInput.next().charAt(0);
        }
        catch (Exception e){
            System.out.println("Operation is not valid");
        }
        while (cInputCal != 'n'&&
                cInputCal != 'N'){

            System.out.println("Value of cInputCal: "+
                    cInputCal);

            System.out.println("Please enter\n"
                    + " m -> Muliplication\n"
                    + " d -> Division\n"
                    + " a -> Addition\n"
                    + " s -> Subtraction\n"
                    + " o -> Modulus\n");
            // get input
            try {
                cInputOp = sUserInput.next().charAt(0);
            }
            catch(Exception e){  
                System.out.println("Error!");
            }
           

            System.out.println("Please enter "
                    + "First Operand");
            try {
                dFirOp = sUserInput.nextDouble();
            }
            catch (Exception e) {
                System.out.println("Error! It can only"
                        + " be a double.");
            }

            System.out.println("Please enter "
                    + "Second Operand");
            try {
                dSecOp = sUserInput.nextDouble();
            }
            catch(Exception e) {
                System.out.println("Error! It can only"
                        + " be a double.");
            }
            try {
                switch (cInputOp){
                    case 'a':
                    case 'A' :
                    case '+': System.out.println(dFirOp
                        + " + " + dSecOp + " = " +
                            (dFirOp + dSecOp));
                            break;
                    case 's':
                    case 'S':
                    case '-' : System.out.println(dFirOp
                        + " - " + dSecOp + " = " + 
                            (dFirOp - dSecOp));
                            break;
                    case 'm':
                    case 'M':
                    case '*': System.out.println(dFirOp
                        + " * " + dSecOp + " = " +
                            (dFirOp * dSecOp));
                            break;
                    case 'd':
                    case 'D':
                    case '/': System.out.println(dFirOp
                        + " / " + dSecOp + " = " +
                            (dFirOp / dSecOp));
                            break;
                    case 'o':
                    case 'O':
                    case '%': System.out.println(dFirOp
                        + " % " + dSecOp + " = " + 
                            (dFirOp % dSecOp));
                            break;
                    default: System.out.println("Operation not"
                            + " allowed.");
                }   // switch ends
            }
            catch(Exception e){
                System.out.println("This operation"
                        + " is not allowed");
            }
                
            System.out.println("Want to calculate [y/n]?");
            try {
                cInputCal = sUserInput.next().charAt(0);
            }
            catch (Exception e){
                System.out.println("Error!");
            }

        }   // while input != n ends        
    }    // constructor with int argument ends
    
    // constructor with arguments
    public double OneMeas(char cInputOp, 
            double dFirOp, double dSecOp){
        System.out.println("Value of cInputCal: " +
                cInputCal + "\n Value of dFirOp: "+
                dFirOp + "\n Value of dSecOp: " + dSecOp);
        double dRes;
        try {
            switch (cInputOp){
                case 'a':
                case 'A' :
                case '+': System.out.println(dFirOp
                    + " + " + dSecOp + " = " +
                        (dFirOp + dSecOp));
                        dRes = dFirOp + dSecOp;
                        break;
                case 's':
                case 'S':
                case '-' : System.out.println(dFirOp
                    + " - " + dSecOp + " = " + 
                        (dFirOp - dSecOp));
                        dRes = dFirOp - dSecOp;
                        break;
                case 'm':
                case 'M':
                case '*': System.out.println(dFirOp
                    + " * " + dSecOp + " = " +
                        (dFirOp * dSecOp));
                        dRes = dFirOp * dSecOp;
                        break;
                case 'd':
                case 'D':
                case '/': System.out.println(dFirOp
                    + " / " + dSecOp + " = " +
                        (dFirOp / dSecOp));
                        dRes = dFirOp / dSecOp;
                        break;
                case 'o':
                case 'O':
                case '%': System.out.println(dFirOp
                    + " % " + dSecOp + " = " + 
                        (dFirOp % dSecOp));
                        dRes = dFirOp % dSecOp;
                        break;
                default: System.out.println("Operation not"
                        + " allowed.");
                        dRes = 0;
            }   // switch ends

            return dRes;

        }
        catch(Exception e){
            System.out.println("This operation"
                    + " is not allowed");
            dRes = 0;
            return dRes;
        }    
    }    // constructor with arguments ends
    
}
