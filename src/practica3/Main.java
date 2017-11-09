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
    
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(4);
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node5 = new BinaryNode(5);
        BinaryNode node6 = new BinaryNode(6);
        BinaryNode node7 = new BinaryNode(7);
        BinaryNode node8 = new BinaryNode(8);
        root.leftChild = node2;
        root.rightChild = node5;
        node2.leftChild = node1;
        node2.leftChild = node3;
        node5.leftChild = node7;
        node7.leftChild = node6;
        node7.leftChild = node8; 
        root.preorderTraversal();
    
    }
}
