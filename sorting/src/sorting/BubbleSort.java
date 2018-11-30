/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class BubbleSort {
    
    // default constructor
    public BubbleSort(){
        System.out.println("You have selected Bubble Sort");
    }
    
    // Swap two elements of an array
    public int[] Swap(int[] nArrTwoElements){
        int temp = nArrTwoElements[0];
        nArrTwoElements[0] = nArrTwoElements[1];
        nArrTwoElements[1] = temp;
        return nArrTwoElements;
    }
    
    // Bubble sort ArrayList
    public ArrayList<Integer> SortArrayList(ArrayList<Integer> aIntElements){
        System.out.println("Value of aIntElements"
                + " inside sort funtion: " + aIntElements);


        // ArrayList<Integer> aIntElementsSort = aIntElements;
//        // create temp 2 elements int array to swap 
//        int[] temp = new int[2];
//        for (int j=0; j<(aIntElements.size()-1); j++){
//            for (int i=0; i<(aIntElements.size()-1); i++){
//                
//                if (aIntElements.get(i) > aIntElements.get(i+1)){
//                    temp[0] = aIntElements.get(i);
//                    temp[1] = aIntElements.get(i+1);
//                    temp = Swap(temp);
//                    aIntElements.set(i, temp[0]);
//                    aIntElements.set(i+1, temp[1]);
//                }
//            }   // for for i ends
//        }   // for for j ends

        // create temp 2 elements int array to swap 
        int temp;
        for (int j=0; j<(aIntElements.size()-1); j++){
            for (int i=0; i<(aIntElements.size()-1); i++){
                
                if (aIntElements.get(i) > aIntElements.get(i+1)){
                    temp = aIntElements.get(i);
                    aIntElements.set(i, aIntElements.get(i+1));
                    aIntElements.set(i+1, temp);
                }
            }   // for for i ends
        }   // for for j ends
        
        System.out.println("Value of ArrayList Sent back "
                + "after sort function: " + aIntElements);
        return aIntElements;
    }
    
    // Bubble Sort with Array Ints
    //public ArrayList<Integer> SortArrayList(ArrayList<Integer> aIntElements){
    public void SortArray(int[] iArr){
        int temp;
        for (int j=0; j<(iArr.length-1); j++){
            for (int i=0; i<(iArr.length-1); i++){
                if(iArr[i] > iArr[i+1]){
                    temp = iArr[i];
                    iArr[i] = iArr[i+1];
                    iArr[i+1] = temp;
                }   // if finishes
            }   // inner loop i finishes   
        }   // outer loop j finishes
    
    }   // end of method SortArray
}
