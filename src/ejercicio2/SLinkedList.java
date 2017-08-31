
package ejercicio2;

import java.util.NoSuchElementException;

/**
 *
 * @author yamb_
 */

public class SLinkedList<E> implements List<E> {
	private SNode<E> top;
	private int size;
        private Object [] arregloDeLista;
	
	public SLinkedList() {
		top = new SNode<E>();
		size = 0;
	}

	@Override
	public void addFirst(E e){
            // TODO Auto-generated method stub
        SNode<E> newNode = new SNode<E>(e);
        
        newNode.next = top.next;
        
        top.next = newNode;
        size++;           
        }

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub
                SNode<E> newNode = new SNode<E>(e);
		
		SNode<E> current = top;
		while(current.next != null)
			current = current.next;
		
		current.next = newNode;
		size++;
		
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
                if (index < 0 || index > size()){
                    throw new IndexOutOfBoundsException();
                }
                SNode<E> x = top;
                SNode<E> newNode = new SNode<E>(element);
                
                for (int i = 0; i< index; i++){
                    x = x.next;    
                }
                newNode.next = x.next;
                x.next = newNode;
		size++;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		if(top.next == null){
            throw new NoSuchElementException();  
        }
        SNode<E> nodeToRemove = top.next;
        top.next = nodeToRemove.next;
        nodeToRemove.next = null;
        size--;
        return nodeToRemove.value;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		if(top.next == null){
            throw new NoSuchElementException();  
        }
        SNode <E> current = top;
        SNode <E> nodeToRemove = top;
        while(current.next.next != null){
            current = current.next;
            
        }
        nodeToRemove = current.next;
        current.next = null;
        size--;
        return nodeToRemove.value;    
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
                if (index < 0 || index >= size()){
                    throw new IndexOutOfBoundsException();
                }
                SNode<E> x = top;
                SNode<E> nodeToRemove = null;
		for (int i = 0 ;  i < index ; i++){
                    if (i == (index)){
                        nodeToRemove = x.next;
                        x.next = x.next.next; 
                    }
                }
                size--;
                return nodeToRemove.value;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
                SNode <E> x = top;
                SNode <E> nodeToRemove = top.next;
                for (int i = 0; i<= size; i++){
                    if (o.equals(x.next.value)){
                        nodeToRemove = x.next;
                        x.next = x.next.next;
                        nodeToRemove.next = null;
                        size--;
                        return true;
                    }
                    x = x.next;
                }
		return false;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
                if(top.next == null){
                    throw new NoSuchElementException();  
                }
		return top.next.value;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
                if (top.next == null){
                    throw new NoSuchElementException();
                }
                
                SNode<E> current = top;
                while (current.next != null)
                    current = current.next;
		return current.value;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
                if (index < 0 || index >= size()){
                    throw new IndexOutOfBoundsException();
                }
                SNode<E> x = top;
		for (int i = 0 ;  i < index ; i++)
                    if (i == (index)){   
                        x = x.next; 
                    }
                return x.value;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
                if (index < 0 || index >= size()){
                    throw new IndexOutOfBoundsException();
                }
                SNode<E> x = top;
                SNode<E> newNode = new SNode<E>(element);
                SNode<E> nodeToRemove = null;
		for (int i = 0 ;  i < index ; i++)
                    if (i == (index)){
                        newNode.next = x.next.next;
                        nodeToRemove = x.next;
                        x.next = newNode; 
                    }
                return nodeToRemove.value;
		
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
                for (SNode<E> x = top.next; x != null; x = x.next){
                    if (e.equals(x.value)){
                        return true;
                    }
		}
                return false;
        }
            

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
                int index = 0;
                if(o == null){
                    for (SNode<E> x = top.next; x != null; x = x.next){
                        if (x.value == null)
                            return index;
                        index++;
                    }
                }
                else {
                    for (SNode<E> x = top.next; x != null; x = x.next){
                        if (o.equals(x.value))
                            return index;
                        index++;
                    }
                }
                return -1;
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
                top.next = null;
                size = 0;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
                this.arregloDeLista = new Object [this.size];
                SNode<E> x = top.next;
                for (int i = 0; i<= size; i++ , x=x.next ){
                    this.arregloDeLista[i] = x.value;
                }
		return arregloDeLista;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
                 if (top.next == null)
                    return "[]";

                SNode current = top.next;
                String returnValue = "[" + current.value;

                while( current.next != null){
                    current = current.next;
                    returnValue += ", " + current.value;
                }
                returnValue += "]";
                return returnValue;
    
	}
}
