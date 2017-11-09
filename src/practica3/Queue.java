/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

import java.util.NoSuchElementException;

/**
 *
 * @author yamb_
 */
public class Queue <E> implements IQueue<E> {
    private LinkedList<E> queue;

    @Override
    public void offer(E e) {
        queue.addFirst(e);
        
    }

    @Override
    public E remove() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
 
        return queue.removeLast();
        
    }

    @Override
    public E element() {
        return queue.getLast();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void clear() {
        queue.clear();
        
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }

    
    
}
