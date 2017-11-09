/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class HeapSort {
    public static void heapSort( int values[]){
        makeHeap(values);
        
        for (int i = values.length; i > 0; i--){
            int lastItem = removeTopItem(values,i);
            values[i-1] = lastItem;
        }
        
    }
    
    public static void makeHeap(int values[]){
        for ( int i = 0; i < values.length; i++){
            int index = i;
            while(index!= 0){
                int parent = (index-1)/2;
                
                if (values[index] <= values[parent]){
                    break;
                }
                
                int temp = values[index];
                values[index] = values[parent];
                values[parent] = temp;
                
                index = parent;
            }
        }
    }
    
    public static int removeTopItem(int values[], int count){
        int result = values[0];
        
        values[0] = values[count -1];
        
        int index = 0;
        while(true){
            int child1 = 2* index + 1;
            int child2 = 2* index + 2;
            
            if (child1>= count ){
                child1 = index;
            }
            if (child2 >= count){
                child2= index;
            }
            if (values[index] >= values[child1] && values[index] >= values[child2]){
                break;
            }
            
            int swapChild = child1;
            if (values[child2] > values[child1]){
                swapChild = child2;
            }
            
            int temp = values[index];
            values[index] = values[swapChild];
            values[swapChild] = temp;
            
            index = swapChild;
        }
        
        return result;
    }
}
