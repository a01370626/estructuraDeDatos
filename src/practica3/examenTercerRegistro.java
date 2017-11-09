/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class examenTercerRegistro {
    
    public static int maxDepth(String str){
        int length = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length(); i++){
            if (left < right){
                return -1;
            }
            if (str.charAt(i) == '('){
                left++;
            }
            else if (str.charAt(i) == ')'){
                right++;
            }
            else{
                length = Math.max(left - right, length);
            }
        }
        if (left == 0 && right == 0){
            return 0;
        }
        if (left != right){
            return -1;
        }
        return length;
    }
    public static LinkedList<Integer> intersect (LinkedList<Integer> list1,LinkedList<Integer> list2 ){
        LinkedList<Integer> intersect = new LinkedList<Integer>();
        Node<Integer> node = list1.header;
            for (int i = 0; i <= list1.size(); i++){
                if (list2.contains(node.next.value)){
                    intersect.addLast(node.next.value);
                }
                node = node.next;
            }
            
        return intersect;
    }
    
    public static LinkedList<Integer> difference (LinkedList<Integer> list1,LinkedList<Integer> list2 ){
        LinkedList<Integer> difference = new LinkedList<Integer>();
        Node<Integer> node = list1.header;
            for (int i = 0; i <= list1.size(); i++){
                if (!list2.contains(node.next.value)){
                    difference.addLast(node.next.value);
                }
                node = node.next;
            }
            
        return difference;
    }
    
    public static int shapeArea(int n){
        if ( n == 1){
            return 1;
        }
       return shapeArea(n-1) + 4*(n-1); 
    }
    
}
