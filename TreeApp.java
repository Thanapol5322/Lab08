
public class TreeApp {

	public static void main(String[] args) {
		
		System.out.println("------------------------");
		System.out.println("Binary Tree creteTree1()");
		System.out.println("------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree1();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("------------------------");
		System.out.println("Binary Tree creteTree2()");
		System.out.println("------------------------");
		tree.createTree2();
		tree.printTree(tree.getRoot(), 0);
		

		System.out.println("------------------------");
		System.out.println("Binary Tree creteTree3()");
		System.out.println("------------------------");
		tree.createTree3();
		tree.printTree(tree.getRoot(), 0);
	

	}

}
