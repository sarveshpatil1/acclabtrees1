package searchtrees;
import java.util.concurrent.ThreadLocalRandom;
public class TREESLAB1Q4 {
	/* this main function calls all the methods of Trees 
	   and displays the avg time taken for each reach operation*/
	public static void main(String[] args) {
		
		int n=100000;
		long start,end,bstavg=0,avlavg=0,sptavg=0,rbstavg=0,avg=0;
	
		
BinarySearchTree<Integer> bst=new BinarySearchTree<>();
AVLTree<Integer> avl=new AVLTree<>();
SplayTree<Integer> spt=new SplayTree<>();
RedBlackBST<Integer, Integer> rbst=new RedBlackBST<>();

System.out.println("Sequential..\n");
//INSERT
for(int i=1;i<=n;i++) 
{	//BST insertion
	start=System.nanoTime();
	bst.insert(i);
	end=System.nanoTime();
	bstavg+=(end-start);
	//AVL Insertion
	start=System.nanoTime();
	avl.insert(i);
	end=System.nanoTime();
	avlavg+=(end-start);
	//Splay Insertion
	start=System.nanoTime();
	spt.insert(i);
	end=System.nanoTime();
	sptavg+=(end-start);
	//REDBLACK tree
	start=System.nanoTime();
	rbst.put(i,i);
	end=System.nanoTime();
	rbstavg+=(end-start);
	
}
System.out.println("\nThe avg time taken for BinarySearchtree insertion "+bstavg/n);
System.out.println("The avg time taken for AVLTree insertion "+avlavg/n);
System.out.println("The avg time taken for SplayTree insertion "+sptavg/n);
System.out.println("The avg time taken for RedBlackBST insertion "+rbstavg/n);

bstavg=sptavg=avlavg=rbstavg=0;
//SEARCH
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	bst.contains(rN);
	end=System.nanoTime();
	bstavg+=(end-start);
	//AVL Tree
	start=System.nanoTime();
	avl.contains(rN);
	end=System.nanoTime();
	avlavg+=(end-start);
	//Splay Tree
	start=System.nanoTime();
	spt.contains(rN);
	end=System.nanoTime();
	sptavg+=(end-start);
	//REDBLACK tree
		start=System.nanoTime();
		rbst.get(rN);
		end=System.nanoTime();
		rbstavg+=(end-start);
}

System.out.println("\nThe avg time taken for BinarySearchtree SEARCH "+bstavg/n);
System.out.println("The avg time taken for AVLTree SEARCH "+avlavg/n);
System.out.println("The avg time taken for SplayTree SEARCH "+sptavg/n);
System.out.println("The avg time taken for RedBlackBST SEARCH "+rbstavg/n);

bstavg=sptavg=avlavg=rbstavg=0;

//DELETE
for(int i=n;i>0;i--) 
{	//BST 
	start=System.nanoTime();
	bst.remove(i);
	end=System.nanoTime();
	bstavg+=(end-start);
	//AVL TREE
	start=System.nanoTime();
	avl.remove(i);
	end=System.nanoTime();
	avlavg+=(end-start);
	//SPLAY TREE
	start=System.nanoTime();
	spt.remove(i);
	end=System.nanoTime();
	sptavg+=(end-start);
	//REDBLACK tree
	start=System.nanoTime();
	rbst.delete(i);
	end=System.nanoTime();
	rbstavg+=(end-start);
}
System.out.println("\nThe avg time taken for BinarySearchtree DELETE "+bstavg/n);
System.out.println("The avg time taken for AVLTree DELETE "+avlavg/n);
System.out.println("The avg time taken for SplayTree DELETE "+sptavg/n);
System.out.println("The avg time taken for RedBLACKBST DELETE "+rbstavg/n);
bstavg=sptavg=avlavg=rbstavg=0;

System.out.println("\nRANDOM..\n");
//RANDOM INSERT
for(int i=1;i<=n;i++) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	bst.insert(rN);
	end=System.nanoTime();
	bstavg+=(end-start);
	//AVL TREE
	start=System.nanoTime();
	avl.insert(rN);
	end=System.nanoTime();
	avlavg+=(end-start);
	//Splay Tree
	start=System.nanoTime();
	spt.insert(rN);
	end=System.nanoTime();
	sptavg+=(end-start);
	//REDBLACK tree
	start=System.nanoTime();
	rbst.put(i,rN);
	end=System.nanoTime();
	rbstavg+=(end-start);
}
System.out.println("\nThe avg time taken for BinarySearchtree RANDOM INSERT "+bstavg/n);
System.out.println("The avg time taken for AVLTree RANDOM INSERT "+avlavg/n);
System.out.println("The avg time taken for SplayTree RANDOM INSERT "+sptavg/n);
System.out.println("The avg time taken for REDBLACKBST RANDOM INSERT "+rbstavg/n);

bstavg=sptavg=avlavg=rbstavg=0;
int x;
//RANDOM SEARCH
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	bst.contains(rN);
	end=System.nanoTime();
	bstavg+=(end-start);
	//AVL TrEE
	start=System.nanoTime();
	avl.contains(rN);
	end=System.nanoTime();
	avlavg+=(end-start);
	//Splay TREE
	start=System.nanoTime();
	spt.contains(rN);
	end=System.nanoTime();
	sptavg+=(end-start);
	//REDBLACK tree
	start=System.nanoTime();
	//x=rbst.get(rN);
	end=System.nanoTime();
	rbst.get(rN);
	rbstavg+=(end-start);
}
System.out.println("\nThe avg time taken for BinarySearchtree RANDOM SEARCH "+bstavg/n);
System.out.println("The avg time taken for AVLTree RANDOM SEARCH "+avlavg/n);
System.out.println("The avg time taken for SplayTree RANDOM SEARCH "+sptavg/n);
System.out.println("The avg time taken for REDBLACKBST RANDOM SEARCH "+rbstavg/n);
bstavg=sptavg=avlavg=rbstavg=0;
//RANDOM DELETE
for(int i=n;i>0;i--) 
{	//BST RD
	int rN = ThreadLocalRandom.current().nextInt(1,100000);
	
	start=System.nanoTime();
	bst.remove(rN);
	end=System.nanoTime();
	bstavg+=(end-start);
	//SPT RD
	start=System.nanoTime();
	spt.remove(rN);
	end=System.nanoTime();
	sptavg+=(end-start);
	//AVL RD
	start=System.nanoTime();
	avl.remove(rN);
	end=System.nanoTime();
	avlavg+=(end-start);
	//RBST RD
	start=System.nanoTime();
	rbst.delete(rN); //please comment system.err line in redblack bst delete function
	end=System.nanoTime();
	rbstavg+=(end-start);
	
}

System.out.println("\nThe avg time taken for BinarySearchtree RANDOM DELETE "+bstavg/n);
System.out.println("The avg time taken for AVLTree RANDOM DELETE "+avlavg/n);
System.out.println("The avg time taken for splayTree RANDOM DELETE "+sptavg/n);
System.out.println("The avg time taken for REDBLACKBST RANDOM DELETE "+rbstavg/n);


System.out.println("\nE.O.O\n");

	}

}
