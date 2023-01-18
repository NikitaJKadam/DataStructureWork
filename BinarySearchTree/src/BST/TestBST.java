package BST;

public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(90);		
		bst.insert(40);
		bst.insert(120);		
		bst.insert(60);
		bst.insert(45);
		bst.insert(75);
		bst.insert(20);
		bst.insert(10);	
		System.out.println("count: "+bst.getCount(bst.getRoot()));
		
		System.out.println("--orders with recursion--");
		bst.inOrder(bst.getRoot());
		System.out.println();
		bst.preOrder(bst.getRoot());
		System.out.println();		
		bst.postOrder(bst.getRoot());
		System.out.println();
		bst.getMax();
		bst.getMin();
		
		System.out.println("---orders using stack----");
		bst.inOrder();
		bst.preOrder();		
		bst.postOrder();
		
		System.out.println("--after deleteing-----");
		bst.delete(40);
		bst.inOrder();
		bst.delete(60);
		bst.inOrder();
		bst.delete(90);
		bst.inOrder();
		bst.delete(120);
		bst.inOrder();		
		bst.delete(50);
		bst.inOrder();
		System.out.println(bst.search(75));
		System.out.println(bst.search(175));
		System.out.println(bst.search(bst.getRoot(), 75));
		
		System.out.println("---min and max with recursion---");
		System.out.println(bst.getMax(bst.getRoot()));
		System.out.println(bst.getMin(bst.getRoot()));
		
		
		
	}

}
