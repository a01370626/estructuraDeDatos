/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author yamb_
 */
public class integerNode {
    
    public int value;
    
    public integerNode next;
    
    
    public integerNode (){
        //sentinela
        value = 0;
        next = null;
    }
    
    public integerNode(int value){
        this.value = value;
        next  = null;
    }
            
}
