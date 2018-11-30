/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author root
 */
public class MergeSort {
    public MergeSort(){
        System.out.println("You have selected Merge Sort");
    }
    
    public void Merge(int[] nArr, int nLimLess, int nMidPoint,
            int nLimMore){
        // Find size of sub-arrays that're going to merge
        int nSizeArrFirst = nMidPoint - nLimLess + 1;
        int nSizeArrSecond = nLimMore - nMidPoint;
        
        // Create temp arrays of above sizes
        int[] aArrFirst = new int[nSizeArrFirst];
        int[] aArrSecond = new int[nSizeArrSecond];
        
        // Copy array to  temp arrays
        for(int i=0; i<nSizeArrFirst; ++i){
            aArrFirst[i] = nArr[nLimLess + i];
        }
        for (int i=0; i<nSizeArrSecond; ++i){
            aArrSecond[i] = nArr[nMidPoint + 1 + i];
        }
        
        // Initialize indexes to first and second subarrays
        int nIndexFirArr = 0, nIndexSecArr = 0;
        
          
        // Initialize index of Merged subarrays 
        int  nLimLessCopy = nLimLess; 
        while (nIndexFirArr < nSizeArrFirst &&
                nIndexSecArr < nSizeArrSecond) {

            if (aArrFirst[nIndexFirArr] 
                    <= aArrSecond[nIndexSecArr]) {
                nArr[nLimLessCopy] = aArrFirst[nIndexFirArr]; 
                nIndexFirArr++; 
            } 
            else{
                nArr[nLimLessCopy] = aArrSecond[nIndexSecArr]; 
                nIndexSecArr++; 
            } 
            nLimLessCopy++; 
        }    
  
        /* Copy remaining elements of aArrFirst[] if any */
        while (nIndexFirArr < nSizeArrFirst) {
            nArr[nLimLessCopy] = aArrFirst[nIndexFirArr]; 
            nIndexFirArr++; 
            nLimLessCopy++; 
        } 
  
        /* Copy remaining elements of aArrSecond[] if any */
        while (nIndexSecArr < nSizeArrSecond) {
            nArr[nLimLessCopy] = aArrSecond[nIndexSecArr]; 
            nIndexSecArr++; 
            nLimLessCopy++; 
        } 
            
    }   // Merge method ends
    
    public void MergeSort(int[] nArr, int nLimLess, int nLimMore){
        if (nLimLess < nLimMore){
            // Find middle point
            int nMidPoint = ((nLimLess + nLimMore) / 2);
            
            // Recursive Call Find middle points for Sorting 
            // both halves
            MergeSort(nArr, nLimLess, nMidPoint);
            MergeSort(nArr, nMidPoint+1, nLimMore);
            
            // Merge the Sorted Halves by Merge function
            Merge (nArr, nLimLess, nMidPoint, nLimMore);
        }
        
    }

}
    
