import java.util.*;

/**
 * Name: John Martin 
 * Date: 11/20/2014 
 * TA: Matt 
 * CSc 3410
 * 
 * Program: BSTree.java
 * 
 * This is a program called BSTree.java. This program generates 50 random
 * integers between 1 and 99 and stores these items in a vector. The program
 * builds a binary search tree using the vector of integers. After building the
 * tree, an infix recursive method is used to display data on the screen. A
 * linked list is created to build this binary tree.
 * 
 * Data Structure(s) Used: 
 *   * Vector 
 *     - Used to store random integers between 1 and 99 
 *   * Binary Search Tree 
 *     - Traverse through tree to sort elements
 * 
 * Algorithm: 
 *   1. Initialize a vector of 50 elements. 
 *   2. Generate 50 random integers between 1 and 99. 
 *   3. Traverse them in order from least to greatest in a binary tree.
 * 
 * Algorithm for adding a node: 
 *   1. Initialize root to null. 
 *   2. If root is not null, 
 *   3.   If node is less than root, 
 *   4.     If root does not have a left child, 
 *   5.       Add node as left child to root. 
 *   6.   Else if node is greater than or equal to root, 
 *   7.     If root does not have a right child, 
 *   8.       Add node as right child to root. 
 *   9. Else, 
 *   10.  Return.
 *   
 *   
 * Algorithm for traversing a tree: 
 *   1. If node is null, 
 *   2.   Return. 
 *   3. If node is not null, 
 *   4.   Traverse left child. 
 *   5.   Print the node's current value. 
 *   6.   Traverse right child.
 */

public class BSTree {
	Node root; // Root of binary tree
	Node curr; // Current node

	public static void main(String[] args) {
		// Binary tree
		BSTree tree = new BSTree();

		// Initialize variables
		Random r = null;
		int low = 0;
		int high = 0;
		int randNum = 0;

		// Vector to hold 50 random integers
		Vector<Integer> numbers = new Vector<Integer>(50, 0);

		// Add random elements to the vector
		for (int i = 0; i < 50; i++) {
			r = new Random();
			low = 1;
			high = 99;
			randNum = r.nextInt(high - low) + low; // Generate a random number
			numbers.addElement(randNum); // Add random integer to vector
		}

		// Print vector elements on the screen in unsorted order
		System.out.print("Original order: ");
		for (int i = 0; i < numbers.size(); i++)
			System.out.print(numbers.elementAt(i) + " ");

		Node n = null;
		System.out.println();
		
		// Print binary tree traversal
		System.out.print("Binary tree inorder traversal: ");
		for (int i = 0; i < numbers.size(); i++) {
			n = new Node(numbers.elementAt(i));
			tree.addNode(n.getData()); // Add node to tree
		}
		tree.traverse(tree.root); // Traverse tree from left to right and print it
	}

	/**
	 * Pre-condition: Takes a node and adds it to a binary tree 
	 * Post-condition: Node is added to the binary tree 
	 * Parameter(s): Value of node to be added
	 */
	public void addNode(int element) {
		if (root == null) {
			root = new Node(element); // Create new root
			return;
		} else { // Root is not null
			curr = root; // Set a current node equal to the root of the tree
			Node parent; // Parent node

			// Add nodes
			while (true) {
				parent = curr; // Set parent node (root) equal to current node
				if (element < curr.getData()) { // New node is less than current node
					curr = curr.left; // Set current node to left child
					if (curr == null) { // Current node does not have a left child
						parent.left = new Node(element); // Add left child of current node
						return; // Break out of while loop
					}
				} else { // New node is greater than or equal to current node
					curr = curr.right; // Set current node to right child
					if (curr == null) { // Current node does not have a right child
						parent.right = new Node(element); // Add right child of current node
						return; // Exit loop
					}
				}
			}
		}
	}

	/**
	 * Pre-condition: Data in binary tree is unsorted; takes a node and traverses it in 
	 *   inorder 
	 * Post-condition: All nodes are visited from least to greatest 
	 * Parameter(s): Node to be visited
	 */
	public void traverse(Node n) {
		if (n == null)
			return; // Traversal is done
		else {
			traverse(n.left); // Traverse left node
			System.out.print(n.getData() + " "); // Print current node
			traverse(n.right); // Traverse right node
		}
	}

}
