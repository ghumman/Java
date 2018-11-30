/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;


import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author root
 */
public class Expert {
    
    private char cOp;
    private String[] parts;
    private double[] dArr= new double[2];
    
    // default contructor
    public Expert(){
        System.out.println("Expert Object created");
    }
    public void Calculate(){
        /*  User is going to say
        2+2
        2 + 2
        3+ 2
        2 +2
        */
        System.out.println("Please write "
                + "calculation command");
        Scanner sUserInput = new Scanner(System.in);
        String sUserRes = sUserInput.nextLine();
//        System.out.println(sUserRes);
        
        /* Find out if experssion has 
        either + or - or * or / or %
        */
        try {
            if (sUserRes.indexOf('+')>= 0 ){
                cOp = '+';
                parts = sUserRes.split("\\+");
                for (int i=0; i<parts.length; i++){
//                    System.out.println("Value of parts[i]: " + parts[i]);
                    dArr[i] = Double.parseDouble(parts[i]);
//                    System.out.println("Value of dArr[i]: " + dArr[i]);
                }
                System.out.println("Result: " + (dArr[0]+dArr[1]));
            }else if (sUserRes.indexOf('-')>= 0 ){
                cOp = '-';
                parts = sUserRes.split("\\-");
                for (int i=0; i<parts.length; i++){
//                    System.out.println("Value of parts[i]: " + parts[i]);
                    dArr[i] = Double.parseDouble(parts[i]);
//                    System.out.println("Value of dArr[i]: " + dArr[i]);
                }
                System.out.println("Result: " + (dArr[0]-dArr[1]));
            }else if (sUserRes.indexOf('*')>= 0 ){
                cOp = '*';
                parts = sUserRes.split("\\*");
                for (int i=0; i<parts.length; i++){
//                    System.out.println("Value of parts[i]: " + parts[i]);
                    dArr[i] = Double.parseDouble(parts[i]);
//                    System.out.println("Value of dArr[i]: " + dArr[i]);
                }
                System.out.println("Result: " + (dArr[0]*dArr[1]));
            }else if (sUserRes.indexOf('/')>= 0 ){
                cOp = '/';
                parts = sUserRes.split("\\/");
                for (int i=0; i<parts.length; i++){
//                    System.out.println("Value of parts[i]: " + parts[i]);
                    dArr[i] = Double.parseDouble(parts[i]);
//                    System.out.println("Value of dArr[i]: " + dArr[i]);
                }
                System.out.println("Result: " + (dArr[0]/dArr[1]));
            }else if (sUserRes.indexOf('%')>= 0 ){
                cOp = '%';
                parts = sUserRes.split("\\%");
                for (int i=0; i<parts.length; i++){
//                    System.out.println("Value of parts[i]: " + parts[i]);
                    dArr[i] = Double.parseDouble(parts[i]);
//                    System.out.println("Value of dArr[i]: " + dArr[i]);
                }
                System.out.println("Result: " + (dArr[0]%dArr[1]));
            }else {
                System.out.println("Expresssion is not valid");
            }
        }   // try ends
        catch(Exception e){
            System.out.println("Something went wrong. Please"
                    + " try again");
        }   // catch ends
    }   // default constructor ends
}
