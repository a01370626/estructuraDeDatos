/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class tipoExamen {
    
    public static int gdc(int m, int n){
        int b;
        if (m == n){
            return m;
        }
        else if (m > n){
            b = m - n;
           return gdc(b,n);
        }
        else {
            b = n - m;
            return gdc(m,b);    
        }
    }
    
    public static int pow(int base, int exponent){
        if (exponent == 0){
            return 1;
        }else{
            return base *pow(base, (exponent-1));
        }
    }
    
   
    public static int consecutiveAddition(int start, int end){
        if( start > end){
            return 0;
        }
        return start + consecutiveAddition((start + 1), end);
    }
    
    
}
