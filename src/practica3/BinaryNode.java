/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class BinaryNode {
    public int value;
    public BinaryNode leftChild;
    public BinaryNode rightChild;
    
    public BinaryNode (int value){
        this.value = value;
        leftChild = null;
        rightChild = null;  
    }
    
    public void preorderTraversal(){
        preorder(this);
        
    }
    public void inorderTraversal(){
        
    }
    public void postorderTraversal(){
        
    }
    public void depthFirstTraversal(){
        
    }
    
    private void preorder(BinaryNode node){
        System.out.println(node.value);
        if (node.leftChild != null){
            preorder(node.leftChild);
        }
        if (node.rightChild != null){
            preorder(node.rightChild);
        }
        return;
        
    }
    private void inorder(BinaryNode node){
        
        
    }
    private void postorder(BinaryNode node){
        
    }
}
