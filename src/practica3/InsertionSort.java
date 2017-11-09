/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class InsertionSort {
    
    public static void insertionSort(int values[]){
        int temp;
        int start = 0;
        int end;
        for( int i = 1 ; i < values.length; i++){
            temp = values[i];
            end = i;
            for (int j = 0; j < i; j++){
               if (values[j] > temp){
                   start = j;
               }     
            }
            shiftRight(values, start, end);
            
            values[start] = temp;
            
        }
        
    }
    
    public static void shiftRight(int values[], int start, int end ){
        for ( int i = end; i > start ; i--){
            values[i] = values[(i-1)];
        }
        
    }
    
    
    
}
