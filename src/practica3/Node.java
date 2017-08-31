/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class Node <T> {
    public T value;
    public Node<T> prev;
    public Node <T> next;
    
    public Node (){
        value = null;
        prev = this;
        next = this;
    }
    
    public Node (T value){
        this.value = value;
        prev = this;
        next = this;
              
    }
}
