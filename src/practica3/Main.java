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
    public static int shapeArea(int n){
        if ( n == 1){
            return 1;
        }
       return shapeArea(n-1) + 4*(n-1); 
    }
    
    public static void main(String[] args) {
        
        System.out.println(shapeArea(1));
        System.out.println(shapeArea(2));
        System.out.println(shapeArea(3));
        System.out.println(shapeArea(4));
        System.out.println(shapeArea(6));
       
    }
}
