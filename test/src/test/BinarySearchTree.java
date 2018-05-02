package test;

class Node {
    public int value;
    public Node left, right;
    
    public int getValue() {
    	    return this.value;
    }
    
    public boolean hasLeft() {
    	   if (this.left != null)
    		   return true;
    	   else
    		   return false;
    }

    public boolean hasRight() {
    	   if (this.right != null)
    		   return true;
    	   else
    		   return false;
    }
    
    public Node getLeft() {
    	    return this.left;
    }
    
    public Node getRight() {
    	    return this.right;
    	    
    }
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
    	    if ( root.getValue() == value) 
    	        return true;
    	    boolean contains = false;
    	    
    	    if ( root.hasLeft()) {
    	    	    contains = contains(root.getLeft(), value);
    	    }
    	    if (!contains && root.hasRight()) {
    	    	    contains = contains(root.getRight(), value);
    	    }
    	    return contains;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        int i = 1;
        int j = 0;
        int k = 0;
        System.out.println(contains(n2, 3));
	    System.out.println(new MainClass().methodOfTest());
	    j = i-- + --i;
	    k = i++ - ++i;
	    System.out.println("i is " + j);
	    System.out.println("k is " + k);
	    System.out.println(128>>4);
	    String var1 = "xyz";
	    String var2 = new String("XYZ");
	    if (var1==var2)
	    		System.out.println(1);
	    else
	    		System.out.println(2);
	    if (var1.equalsIgnoreCase(var2))
	    		System.out.println(3);
	    else
	    		System.out.println(4);
	    int x,y=6;
	    x=(y<9)?2:1;
	    switch(x) {
	    case 0:System.out.println(0);break;
	    case 1:System.out.println(1);
	    case 2:System.out.println(2);break;
	    case 3:System.out.println(3);break
	    ;
	    }
    }
}
