/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class MergeSort {
    
    public static void MergeSort(int values[], int scratch[], int start, int end){
        if (start>= end){
            return;
        }
        
        int midpoint = (start + end) / 2;
        
        MergeSort(values, scratch, start , midpoint);
        MergeSort(values, scratch, (midpoint + 1) , end);
        
        int leftIndex = start;
        int rightIndex = midpoint + 1;
        int scratchIndex = leftIndex;
        
        while(leftIndex <= midpoint && rightIndex <= end){
            if (values[leftIndex] <= values[rightIndex]){
                scratch[scratchIndex] = values[leftIndex];
                leftIndex = leftIndex + 1;
            }
            else{
                scratch[scratchIndex] = values[rightIndex];
                rightIndex = rightIndex + 1;
            }
            scratchIndex = scratchIndex + 1;
        }
        
        for (int i = leftIndex; i<= midpoint; i++){
            scratch[scratchIndex] = values [i];
            scratchIndex = scratchIndex + 1;
        }
        for (int i = rightIndex; i<= end; i++){
            scratch[scratchIndex] = values [i];
            scratchIndex = scratchIndex + 1;
        }
        
        for (int i = start; i <= end; i++){
            values[i] = scratch[i];
        }
    }       
}
