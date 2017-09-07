/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package examen;

import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
	public Object[] top;
	private int size;
	private int initialCapacity = 5;
	private int extraCapacity = 5;
	 public Object[] newTop;
	/**
	 * Creates a new ArrayList instance with the default initial capacity.
	 */
	public ArrayList() {
		top = new Object[initialCapacity];
		size = 0;
	}
	
	/**
	 * Increases the capacity of this ArrayList instance so that it 
	 * can hold at least extraCapacity elements more.
	 * This method allocates a new array with greater capacity than the
	 * current one (top.length + extraCapacity) and copies all elements
	 * from top to the newly allocated array. The reference top is then
	 * updated to point to the new array. 
	 * @param extraCapacity increase the capacity of this ArrayList by this amount
	 */
	private void reserveExtraCapacity(int extraCapacity) {
             newTop = new Object[top.length + extraCapacity];
             for ( int i = 0; i < size ; i++){
                 newTop[i] = top[i];
             }
             top = newTop;
        }
	
	/**
	 * Increases the capacity of this list if its size equals the length of the array
	 * where the data is stored. This method calls reserveExtraCapacity when (size() >= top.length).
	 * reserveExtraCapacity is called using the instance variable extraCapacity.
	 */
	private void ensureCapacity() {
            if (size >= top.length){
                reserveExtraCapacity(extraCapacity);
            }
            
	}
	
	/**
	 * Shifts elements in the array (top) to the right, starting at the given position.
	 * @param index the position in which the shift will begin
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
	 */
	private void shiftContentsRight(int index) {
                ensureCapacity();
                newTop = new Object[top.length];
                int i = 0;
                for (  i = 0; i < index ; i++){
                 newTop[i] = top[i];
                } 
                for (i = index; i < top.length ; i++){
                    newTop[(i + 1)] = top[i];
                }
                top = newTop;            
            
        }
	@Override
	public void addFirst(E e) {
            shiftContentsRight(0);
            top[0] = e;
            size++;
	}

	@Override
	public void addLast(E e) {
            ensureCapacity();
            top[size] = e;
            size++;
	}

	@Override
	public void add(int index, E element) {
            if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
            shiftContentsRight(index);
            top[index] = element;
            size++;
	}

	@Override
	public E getFirst() {
            if (size == 0){
            throw new NoSuchElementException();
        }
		return (E) top[0];
	}

	
	@Override
	public E getLast() {
            if (size == 0){
            throw new NoSuchElementException();
        }
                 
            return (E) top[size];
	}

	
	@Override
	public E get(int index) {
	if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }	
            return (E) top[index];
	}

	@Override
	public E set(int index, E element) {
            if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
            shiftContentsRight(index);
            top[index] = element;
		return null;
	}

	@Override
	public void clear() {
            for (int i = 0; i < top.length; i++){
                top[i] = null;
            }
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
            if (size == 0){
                    return "[]";
            }
            String returnValue = "[" + top[0];
                for (int i = 1; i < top.length; i++){
                    returnValue += ", " + String.valueOf(top[i]);
                }
                
                returnValue += "]";
                return returnValue;
    
	}
}

