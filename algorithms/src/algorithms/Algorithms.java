/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author root
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStructure arrObj = new ArrayStructure();
        // int value = 45;
        arrObj.generateRandomArray();
        arrObj.printArray();
        // System.out.println( "Result of linear search: " + arrObj.linearSearchForValue(5));
        arrObj.bubbleSort();
        System.out.println("After bubble sort");
        arrObj.printArray();
//        arrObj.deleteIndex(3);
//        arrObj.printArray();
//        arrObj.insertValue(value);
//        arrObj.printArray();
//        System.out.println("Does it contain "+ value + ": "
//                + arrObj.doesArrayContainThisValue(45));
//        arrObj.printArray();

        arrObj.bubbleSortDesc();
        System.out.println("After bubble sort");
        arrObj.printArray();
        arrObj.bubbleSort();
        arrObj.printArray();

        
    }
    
}
