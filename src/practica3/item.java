/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
import java.util.*; 

public class ITEM {

    private int peso, valor;
    
    public ITEM(int peso, int valor){
    
        if (peso>=25){
            this.peso=peso;
        }
        else{
            this.peso=25;
        }
        
        if (valor>=25){
            this.valor=valor;
        }
        else{
            this.valor=25;
        }
    }
   
    
   
    }
