/** 
 * The Node class creates a node and adds it to a binary tree.
 */

@SuppressWarnings("hiding")
public class Node<Integer> {
	// Instance variables
	int data;
	Node<?> left, right, root, curr;

	// Constructor of node class
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.root = null;
	}

	
	
	/** 
	 * Pre-condition: Tests to see if a current node has a left child
	 * Post-condition: If the current node has a left child, method returns true; 
	 *   otherwise, returns false
	 * Parameter(s): None
	 */
	public boolean hasLeftChild() {
		if (curr.left == null) // Node does not have a left child; return false
			return false;
		else
			return true; // Node has a left child; return true
	}
	
	/**
	 * Pre-condition: Tests to see if a current node has a right child
	 * Post-condition: If the current node has a right child, method returns true; 
	 *   otherwise, returns false
	 * Parameter(s): None
	 */
	public boolean hasRightChild() {
		if (curr.right == null)
			return false;
		else
			return true;
	}

	// Get left node
	public Node<?> getLeft() {
		return left;
	}
	
	// Get right node
	public Node<?> getRight() {
		return right;
	}
	
	// Get data from a node and return it
	public int getData() {
		return data;
	}
	
	/** 
	 * Pre-condition: Takes a node to set to the left node
	 * Post-condition: The left node is set to another value
	 * Parameter(s): The node to be set
	 */
	public void setLeft(Node<Integer> left) {
		this.left = left;
	}
	
	/**
	 * Pre-condition: Takes a node to set to the right node
	 * Post-condition: The right node is set to another value
	 * Paramater(s): The node to be set
	 */
	public void setRight(Node<Integer> right) {
		this.right = right;
	}
	
	/** 
	 * Pre-condition: None
	 * Post-condition: Prints values into a string
	 * Parameter(s): None
	 */
	public String toString() {
		return data + " ";
	}
}
