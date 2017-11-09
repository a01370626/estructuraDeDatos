/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public interface IStack <E> {
    public E push (E e);
    
    public E pop();
    
    public E peek();
    
    public boolean empty();
    
    public Object[] toArray();
}
