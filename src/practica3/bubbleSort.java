/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class bubbleSort {
     public static void bubbleSort( int values[]){
        boolean not_sorted = true;
        int temp;
        while(not_sorted){
            
            for (int i = 1; i< (values.length-1); i++){
                if (values[i] < values[i-1]){
                    temp = values[i];
                    values [i] = values [i - 1];
                    values [i-1] = temp;
                    not_sorted = true;
                }
            }   
        }
    }
    
    
}
