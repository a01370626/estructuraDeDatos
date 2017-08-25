
package practica2;

import java.util.NoSuchElementException;

/**
 *
 * @author yamb_
 */
public class sLinkedList <E> {
    private sNode <E> top;
    private int size;
    
    public sLinkedList(){
        top = new sNode<E>();
        size = 0;
        
    }
    
    public void addFirst(E e){
        sNode<E> newNode = new sNode<E>(e);
        
        newNode.next = top.next;
        
        top.next = newNode;
        size++;
                
}
    public void addLast (E e){
        sNode<E> newNode = new sNode<E>(e);
		
		sNode<E> current = top;
		while(current.next != null)
			current = current.next;
		
		current.next = newNode;
		size++;
    }
    
    public E removefirst(){
        if(top.next == null){
            throw new NoSuchElementException();  
        }
        sNode<E> nodeToRemove = top.next;
        top.next = nodeToRemove.next;
        nodeToRemove.next = null;
        size--;
        
        return nodeToRemove.value;
        
    }
    
    
    public E removeLast(){
        if(top.next == null){
            throw new NoSuchElementException();  
        }
        sNode <E> current = top;
        sNode <E> nodeToRemove = top;
        while(current.next.next != null){
            current = current.next;
            nodeToRemove = current.next;
        }
        current.next = null;
        size--;
        return nodeToRemove.value;            
    }
    
    public E getFirst(){
        if (top.next == null){
            throw new NoSuchElementException();
        }
        return top.next.value;
    }
    
    public E getLast(){
        if (top.next == null){
            throw new NoSuchElementException();
        }
        sNode<E> current = top;
        while(current.next != null){
            current = current.next;
        }
        return current.value;
    }
    
    public int indexOf(Object o){
        int index = 0;
        
        if(o == null){
            for (sNode<E> x = top.next; x != null; x = x.next){
                if (x.value == null)
                    return index;
                index++;
            }
        }
        else {
            for (sNode<E> x = top.next; x != null; x = x.next){
                if (o.equals(x.value))
                    return index;
                index++;
            }
        }
        return -1;
    }
    
    public void clear(){
        top.next = null;
        size = 0;
        
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public String toString(){
        if (top.next == null)
            return "[]";
        
        sNode current = top.next;
        String returnValue = "[" + current.value;
        
        while( current.next != null){
            current = current.next;
            returnValue += ", " + current.value;
        }
        
        returnValue += "]";
        return returnValue;
    }
        
}
