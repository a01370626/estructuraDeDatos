/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class reverseParentheses {
    
    public static String reverseParentheses(String cadena){
       Stack<Character> pila =new Stack<Character>();
        Character c=null;
        StringBuilder temp = new StringBuilder (cadena.length());
        //StringBuilder temp2 = new StringBuilder (cadena.length());
        StringBuilder Inver =new StringBuilder (cadena.length());
        int bander = 0;
        
        for (int i=0; i<cadena.length(); i++){
            c=cadena.charAt(i);
            if ((!(c.equals('('))) && (bander==0)){
                Inver.append(c);
            }
            else if (c.equals('(')){
                 bander=bander+1;}
            
           else if ((!(c.equals('('))) && (bander==1)){
                    pila.push(c);
                }
           else if ((!(c.equals('('))) && (bander==2)){
               while (!(pila.empty())){
                   temp.append(pila.pop());
               }
               Inver.append(temp);
               temp.delete(0,temp.length());
               bander=bander-1;
                }
           else if ((c.equals(')'))){
               while (!(pila.empty())){
                   temp.append(pila.pop());
               }
               Inver.append(temp);
               temp.delete(0,temp.length());
               bander=bander-1;
               
           }
        }
    return Inver.toString();
}

    
}
