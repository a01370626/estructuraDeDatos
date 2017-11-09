/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class QuickSort {

public static void quickSort(int values[], int start, int end){
    if (start >= end){
        return;
    }
    
    int divider = values[start];
    
    Stack<Integer> before = new Stack<Integer>();
    Stack<Integer> after = new Stack<Integer>();
    
    for(int i = start + 1; i <= end; i++){
        if (values[i]> divider){
            before.push(values[i]);
        }else{
            after.push(values[i]);
        }
    }
    
    int i = start;
    while (!before.empty()){
        values[i++] = before.pop();
    }
    int middle = i;
    values[middle] = divider;
    while (!after.empty()){
        values[++i] = after.pop();
    }
    
    quickSort(values, start, (middle-1));
    quickSort(values, (middle +1), end );

}
    
}
