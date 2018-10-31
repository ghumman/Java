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
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*  ArrayList<integers> arrayList to get all the values from 
            sort function back
        */
//        ArrayList<Integer> aListEle = new ArrayList<>();
//        aListEle.add(70);
//        aListEle.add(60);
//        aListEle.add(65);
//        aListEle.add(61);
//        aListEle.add(59);
//        
//        System.out.println("Value of ArrayList "
//                + "before sending to "
//                + "sort function: " + aListEle);
        
        // Sort using Array of integers
        // int[] nArr = {70, 60, 65, 61, 59};
        int[] nArr = {298, 345, 132, 985, 123, 0, 692, 355};
        // Create an object
//         BubbleSort bub = new BubbleSort();
        // ArrayList<Integer> aListEleSort = new ArrayList<Integer>();
//        ArrayList<Integer>aListEleSort = bub.SortArrayList(aListEle);
//        System.out.println("Final Sorted Array: "
//            + aListEleSort);

//        bub.SortArray(nArr);
//        for (int i=0; i<nArr.length; i++){
//            System.out.println("Value of nArr["
//                + i + "]: " + nArr[i]);
//        }   // for to output array ends

        MergeSort merg = new MergeSort();
        merg.MergeSort(nArr, 0, (nArr.length - 1));
        for (int i=0; i<nArr.length; i++){
            System.out.println("Value of nArr["
                + i + "]: " + nArr[i]);
        }   // for to output array ends
    }   // main ends
    
}   // Sorting class ends
