
package practica2;

/**
 *
 * @author yamb_
 */
public class integerLinkedList {
    
    public integerNode top = null;
    
    public integerLinkedList (){
        top = new integerNode();
    }
    
    public void addFirst ( int element){
        
        integerNode newNode = new integerNode(element);
        
        newNode.next = top.next;
        
        top.next = newNode;
        
    }
    
    public void addLast ( int element){
        integerNode newNode = new integerNode(element);
        
        integerNode current = top;
        while (current.next != null){
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    public String toString(){
        if (top.next == null)
            return "[]";
        
        integerNode current = top.next;
        String returnValue = "[" + current.value;
        
        while( current.next != null){
            current = current.next;
            returnValue += ", " + current.value;
        }
        returnValue += "]";
        
        return returnValue;
    }

}
