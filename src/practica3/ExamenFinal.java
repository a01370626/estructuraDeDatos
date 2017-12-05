/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

import java.util.HashMap;
import java.util.Vector;
/**
 *
 * @author yamb_
 */
public class ExamenFinal {
    public static void moveToBeginning(LinkedList<Integer> lst, int i){
        if (i < 0 || i >= lst.size){
            throw new IndexOutOfBoundsException();
       }
        lst.addFirst(lst.remove(i));
    }
    
   public static String cleanString( String str){
        LinkedList<Character> cleanString = new LinkedList<Character> ();
        char actual;
        for (int i = 0; i <str.length(); i++){
            actual = str.charAt(i);
            if ((actual >= 'a' && actual <= 'z') || (actual >= 'A' && actual <= 'Z')){
                cleanString.addLast(actual);
            }
    }
        
    return cleanString.toString().toUpperCase();
    }
    
    public static int mystery( int m, int n){
        if (m == 0){
            return n+1;
        }
        if (m > 0 && n == 0){
            return mystery(m-1, 1);
            }
          
    return (mystery(m-1, mystery(m, n-1)));
            
    }
   
    public static LinkedList<Integer> union(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> union = new LinkedList<Integer> ();
            while(!list1.isEmpty()){
                union.addLast(list1.removeFirst());
            }
            while(!list2.isEmpty()){
                union.addLast(list2.removeFirst());
            }
        return union;
        
    }
    
    
    public static void moveToTop(Stack<Integer> stack, int i){
        if (i < 0 || i >= stack.size()){
            throw new IndexOutOfBoundsException();
        }
        Stack<Integer> tempStack = new Stack<Integer>();
        int sal;
        int reg;
        
        while(stack.peek() != i){
            sal = stack.peek();
            stack.pop();
            tempStack.push(sal);
        }
        
        stack.pop();
        
        while(!tempStack.empty()){
             reg= tempStack.peek();
            tempStack.pop();
            stack.push(reg);
        }
        stack.push(i);
    }
    
    
    
    
    

}
    


