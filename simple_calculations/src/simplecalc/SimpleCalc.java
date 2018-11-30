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
public class SimpleCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        // Create an object of class Basic
//        Basic cal = new Basic();
//        cal.JobDone();
     

//        CaseCalc calculate = new CaseCalc(); 
//        
//        double dResultCal = calculate.OneMeas('/', 0, 0);

        Expert obj = new Expert();
        obj.Calculate();
        
    }
    
}
