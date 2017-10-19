/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class Main {
    
    /*public static boolean isPalindrome(String word){
        LinkedList<Character> letters = new LinkedList<Character>();
            for (int i = 0; i < word.length() ; i++){
            char letter = word.charAt(i);
            if (Character.isLetter(letter)){
                letters.addLast(Character.toLowerCase(letter));
            }
            while (letters.size() > 1){
                if (! letters.getFirst().equals(letters.getLast())){
                    return false;
            }
            letters.removeFirst();
            letters.removeLast();
            }

        }   
            return true;
    }*/
    public static String reverseParentheses(String cadena){
       Stack<Character> pila =new Stack<Character>();
        Character c=null;
        StringBuilder temp = new StringBuilder (cadena.length());
        StringBuilder Inver =new StringBuilder (cadena.length());
        int bander = 0;
        
        for (int i=0; i<cadena.length(); i++){
            c=cadena.charAt(i);
            if ((!(c.equals('('))) & (bander==0)){
                Inver.append(c);
            }
            else if (c.equals('(')){
                 bander=bander+1;}
            
           else if ((!(c.equals('('))) & (bander==1)){
                    pila.push(c);
                }
           else if ((!(c.equals('('))) & (bander==2)){
               temp.append(pila.pop());
               Inver.append(temp.reverse());
               temp.delete(0,temp.length());
               bander=bander-1;
                }
           else if ((c.equals(')'))){
               temp.append(pila.pop());
               Inver.append(temp.reverse());
               temp.delete(0,temp.length());
               bander=bander-1;
               
           }
        }
    return Inver.toString();
    }
    

    
    
    public static void shiftRight(int values[], int start, int end ){
        for ( int i = end; i > start ; i--){
            values[i] = values[(i-1)];
        }
        
    }
    
    public static void insertionSort(int values[]){
        int temp;
        int start = 0;
        int end;
        for( int i = 1 ; i < values.length; i++){
            temp = values[i];
            end = i;
            for (int j = 0; j < i; j++){
               if (values[j] > temp){
                   start = j;
               }     
            }
            shiftRight(values, start, end);
            
            values[start] = temp;
            
        }
        
    }
    
    public static void selectionSort(int values[]){
        
        int switch1;
        int smallest = 0;
        int smallestPos = 0;
        
        for(int i = 0; i < values.length; i++){
            switch1 = values[i];
            smallest = values[i];
            for (int j = i; j < values.length; j++){
                if (values[j] < smallest){
                    smallest = values[j];
                    smallestPos = j; 
                }
            }
        values[smallestPos] = smallest;
        
        }
    }
    
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
    public static void main (String [] args){
        String s = "a(bc)de";
        System.out.println(reverseParentheses(s));
    }
    
    /*public static void main(String[] args) {
		System.out.println("** TEST CIRCULAR DOUBLY-LINKEDLIST CLASS **");
		System.out.println("\t** USING INTEGERS **");
		LinkedList<Integer> iList = new LinkedList<Integer>();
		
		System.out.println("Testing: addFirst(i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i = 0; i < 10; i++) {
			iList.addFirst(i);
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: isEmpty + removeFirst + toString");
		System.out.println(iList);
		while(!iList.isEmpty()) {
			iList.removeFirst();
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: addLast(i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i=0; i<10; i++) {
			iList.addLast(i);
			System.out.println(iList);	
		}
		System.out.println();

		System.out.println("Testing: isEmpty + removeLast + toString");
		System.out.println(iList);
		while(!iList.isEmpty()) {
			iList.removeLast();
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: add(2 * i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i = 0; i < 10; i++) {
			iList.add(i, i * 2);
			System.out.println(iList);
		}
		System.out.println("Testing: add(4, 7) + toString");
		iList.add(4, 7);
		System.out.println(iList);
		System.out.println("Testing: add(8, 13) + toString");
		iList.add(8, 13);
		System.out.println(iList);
		System.out.println("Testing: add(0, -1) + toString");
		iList.add(0, -1);
		System.out.println(iList);
		System.out.println("Testing: add(size(), 20) + toString");
		iList.add(iList.size(), 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: remove(6) + toString");
		System.out.println(iList);
		iList.remove(6);
		System.out.println(iList);
		System.out.println("Testing: remove(new Integer(6)) + toString");
		iList.remove(new Integer(6));
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: size + indexOf + get");
		for(int i=0; i<iList.size(); i++) {
			System.out.println("Get element at index " + iList.indexOf(iList.get(i)) + ": " + iList.get(i));
		}
		System.out.println();
		
		System.out.println("Testing: size + contains");
		for(int i=0; i<iList.size(); i++) {
			System.out.println("Is element " + i + " contained in the list? " + iList.contains(i));
		}
		System.out.println();
		
		System.out.println("Testing: getFirst + toString");
		System.out.println(iList);
		System.out.println(iList.getFirst());
		System.out.println();
		
		System.out.println("Testing: getLast + toString");
		System.out.println(iList);
		System.out.println(iList.getLast());
		System.out.println();
		
		System.out.println("Testing: set(3, 20) + toString");
		System.out.println(iList);
		iList.set(3, 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: toArray");
		Object[] array = iList.toArray();
		System.out.println(array);
		if(array != null) {
			for(int i=0; i<array.length; i++)
				System.out.print(array[i] + " ");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Testing: clear + toString");
		System.out.println(iList);
		iList.clear();
		System.out.println(iList);
		System.out.println();
		
		System.out.println("\t** USING STRINGS **");
		LinkedList<String> strLinkedList = new LinkedList<String>();
		strLinkedList.addLast("Hello");
		strLinkedList.addLast("World");
		System.out.println(strLinkedList);
		strLinkedList.remove("World");
		System.out.println(strLinkedList);
		System.out.println();
    }
    */
}
