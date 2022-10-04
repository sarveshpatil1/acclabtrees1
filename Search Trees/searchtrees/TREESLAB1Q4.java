package searchtrees;

import java.util.concurrent.ThreadLocalRandom;

public class TREESLAB1Q4 {
	
	public static void main(String[] args) {
		
		int n=100000;
		long start,end,avg=0;
	
		
BinarySearchTree<Integer> bst=new BinarySearchTree<>();
AVLTree<Integer> avl=new AVLTree<>();
SplayTree<Integer> spt=new SplayTree<>();



System.out.println("\nThe avg time taken for BinarySearchtree insertion \n");
for(int i=1;i<=n;i++) 
{
	start=System.nanoTime();
	bst.insert(i);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for BinarySearchtree SEARCH \n");
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	bst.contains(rN);
	end=System.nanoTime();
	avg+=(end-start);
}

System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for BinarySearchtree DELETE \n");

for(int i=n;i>0;i--) 
{
	start=System.nanoTime();
	bst.remove(i);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for BinarySearchtree RANDOM INSERT \n");

for(int i=1;i<=n;i++) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	bst.insert(rN);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for BinarySearchtree RANDOM-SEARCH \n");
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	bst.contains(rN);
	end=System.nanoTime();
	avg+=(end-start);
}

System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for BinarySearchtree RANDOM DELETE \n");

for(int i=n;i>0;i--) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);
	start=System.nanoTime();
	bst.remove(rN);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);


System.out.println("\nE.O.O\n");

System.out.println("\nThe avg time taken for AVLTree insertion \n");
for(int i=1;i<=n;i++) 
{
	start=System.nanoTime();
	avl.insert(i);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for AVLTree SEARCH \n");
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	avl.contains(rN);
	end=System.nanoTime();
	avg+=(end-start);
}

System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for AVLTree DELETE \n");

for(int i=n;i>0;i--) 
{
	start=System.nanoTime();
	avl.remove(i);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for AVLTree RANDOM INSERT \n");

for(int i=1;i<=n;i++) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	avl.insert(rN);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for AVLTree RANDOM-SEARCH \n");
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	avl.contains(rN);
	end=System.nanoTime();
	avg+=(end-start);
}

System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for AVLTree RANDOM DELETE \n");

for(int i=n;i>0;i--) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);
	start=System.nanoTime();
	avl.remove(rN);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

System.out.println("\nE.O.O\n");

System.out.println("\nThe avg time taken for SplayTree insertion \n");
for(int i=1;i<=n;i++) 
{
	start=System.nanoTime();
	spt.insert(i);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for SplayTree SEARCH \n");
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	spt.contains(rN);
	end=System.nanoTime();
	avg+=(end-start);
}

System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for SplayTree DELETE \n");

for(int i=n;i>0;i--) 
{
	start=System.nanoTime();
	spt.remove(i);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for SplayTree RANDOM INSERT \n");

for(int i=1;i<=n;i++) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	spt.insert(rN);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for SplayTree RANDOM-SEARCH \n");
for(int i=1;i<=n;i++) 
{int rN = ThreadLocalRandom.current().nextInt(1,100000);

	start=System.nanoTime();
	spt.contains(rN);
	end=System.nanoTime();
	avg+=(end-start);
}

System.out.println(avg/n);

avg=0;
System.out.println("\nThe avg time taken for splayTree RANDOM DELETE \n");

for(int i=n;i>0;i--) 
{
	int rN = ThreadLocalRandom.current().nextInt(1,100000);
	start=System.nanoTime();
	spt.remove(rN);
	end=System.nanoTime();
	avg+=(end-start);
}
System.out.println(avg/n);

System.out.println("E.O.O");

	}

}
