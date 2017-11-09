/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class SelectionSort {
    public static void selectionSort(int values[]){
        
        int switch1;
        int smallest = 0;
        int smallestPos = 0;
        
        for(int i = 0; i < values.length; i++){
            switch1 = values[i];
            smallest = values[i];
            for (int j = i; j < values.length; j++){
                if (values[j] < smallest){
                    smallest = values[j];
                    smallestPos = j; 
                }
            }
        values[smallestPos] = smallest;
        
        }
    }
    
}
