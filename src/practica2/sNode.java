
package practica2;

/**
 *
 * @author yamb_
 */
public class sNode <T> {
    public T value;
    public sNode<T> next;
    
    public sNode(){
        value = null;
        next = null;
    }
    
    public sNode(T value){
        this.value = value;
        next = null;
    }
}
