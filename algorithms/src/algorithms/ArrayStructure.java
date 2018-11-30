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
public class ArrayStructure {
    
    // create an array with 50 indexes
    // which is upper limit for this array
    private int theArray[] = new int[50];
    
    // number of elements in theArray
    private int arraySize = 10;
    
    // fill theArray with random values
    public void generateRandomArray(){
        
        for (int i=0; i<arraySize; i++ ){
            theArray[i] = (int)(Math.random()*10);
        }
        
    }   // end generateRandomArray
    
    // get array
    public int[] getTheArray(){
        return theArray;
    }
    
    // get array size
    public int getArraySize() {
        return arraySize;
    }
    
    // print all the values inside the array
    public void printArray() {
        System.out.println("---------------------");
        for (int i=0; i<arraySize; i++){
            System.out.print("| "+i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("-----------------");
        }
    }
    
    // return value a given index and if out of range return -1
    public int getValueAtIndex (int index){
        if ((index < arraySize)&& (index >= 0))
            return theArray[index];
        else 
            return -1;
     
    }
    
    // check if value is in the array
    public boolean doesArrayContainThisValue(int index){
        for (int i=0; i<arraySize; i++){
            if (theArray[i] == index)
                return true;
        }
        return false;
    }
    
    
    // delete an index and move rest of values up/back
    public void deleteIndex(int index) {
        for (int i=index; i<(arraySize - 1); i++){
            theArray[i] = theArray[i +1];
        }
        arraySize--;
    }
    
    // insert value in the array
    public void insertValue (int value) {
        if (arraySize < 50)
            theArray[arraySize] = value;
        arraySize++;
    }
    
    // linear search and return string with all the location indexes
    public String linearSearchForValue (int value) {
        String sLoc = new String();
        sLoc = "";
        
        for (int i=0; i<arraySize; i++){
            if (theArray[i] == value)
                sLoc +=  i + " ";
        }
        
        return sLoc;
    }
    
    // bubble sort 
    public void bubbleSort () {
        for (int i=arraySize-1; i>0; i--){
//            for (int k=0; k<arraySize; k++)
//                System.out.println(theArray[k]);
//            System.out.println();
            for (int j=0; j<i; j++)
                if (theArray[j] > theArray[j+1])
                    swap(j, j+1);
        }
        
    }
    
    public void swap(int firstIndex, int secondIndex){
        int temp = theArray[firstIndex]; 
        theArray[firstIndex] = theArray[secondIndex];
        theArray[secondIndex] = temp;
    }
    
        // bubble sort 
    public void bubbleSortDesc () {
        for (int i=arraySize-1; i>0; i--){
//            for (int k=0; k<arraySize; k++)
//                System.out.println(theArray[k]);
//            System.out.println();
            for (int j=0; j<i; j++)
                if (theArray[j] < theArray[j+1])
                    swap(j, j+1);
        }
    }
    
    
    
    
    
}
    