package writtentest;
   class Node {
	    int data;
	    Node left;
	    Node right;
	    public Node(int item) {
	        data=item;
	        left=right=null;
	    }
	}
	public class BST {
	    Node root;
	    int count=0;
	    public int kthSmallest(Node node, int k) {
	        if (node==null) {
	            return -1;
	        }
	        int left=kthSmallest(node.left, k);
	        if (left!=-1) {
	            return left;
	        }
	        count++;
	        if (count==k) {
	            return node.data;
	        }
	        return kthSmallest(node.right, k);
	    }
	    public static void main(String[] args) {
	        BST bst = new BST();
	        bst.root = new Node(7);
	        bst.root.left = new Node(4);
	        bst.root.right = new Node(9);
	        bst.root.left.left = new Node(2);
	        bst.root.left.right = new Node(6);
	        bst.root.right.left = new Node(8);
	        int k = 3;
	        int result = bst.kthSmallest(bst.root, k);
	        System.out.println(result);
	    }
	}





