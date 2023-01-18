package BST;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree()
	{
		this.root=null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	//----insert the node
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if(root==null)
		{
			root=newNode;
			return true;
		}
		
		Node temp=root;
		while(true)
		{
			if(data==temp.getData())
				return false;
			
			if(data<temp.getData())
			{
				//inserting at letf
				if(temp.getLeft()==null)
				{
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
			}
			else
			{
				//inserting at rigtht
				if(temp.getRight()==null)
				{
					temp.setRight(newNode);
					return true;
				}
				temp=temp.getRight();
			}
		}
	}
		
		//-------preorder with recursion N-L-R
		public void preOrder(Node root) 
		{			
			if(root==null)
				return;
			
			System.out.print(root.getData()+" ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
			
		}
		
		//inorder with recursion L-N-R
		public void inOrder(Node root)
		{
			if(root==null)
				return;
			inOrder(root.getLeft());
			System.out.print(root.getData()+" ");
			inOrder(root.getRight());
		}
		
		//postorder with recursion L-R-N
		public void postOrder(Node root)
		{
			if(root==null)
				return;
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+" ");			
		}
		
		//-------to find max element @at rightmost elem 
		public Integer getMax() 
		{
			if(root==null)
				return null;
			
			Node temp=root;
			while(temp.getRight()!=null)
			{
				temp=temp.getRight();
			}
			System.out.println("Max element: "+temp.getData()+" ");
			return temp.getData();			
		}
		
		//with recursion
		public Integer getMax(Node root)
		{
			if(root==null)
				return 0;
			if(root.getRight()!=null)
			{
				return getMax(root.getRight());
			}
			return root.getData();
		}
		
		//--------find min @leftmost
		public Integer getMin() 
		{
			if(root==null)
				return null;
			
			Node temp=root;
			while(temp.getLeft()!=null)
			{
				temp=temp.getLeft();
			}
			System.out.println("min element: "+temp.getData()+" ");
			return temp.getData();
		}
		//get min with recursion
		public Integer getMin(Node root)
		{
			if(root==null)
				return 0;			
			if(root.getLeft()!=null)
			{
				return getMin(root.getLeft());
			}
			return root.getData();			
		}
		
		//------ORDER using Stack---------
		//preOrder with stack N-L-R
		public void preOrder()
		{
			Stack<Node> stack=new Stack<Node>();
			Node temp=root;
			
			while(temp!=null || !(stack.isEmpty()))
			{
				while(temp!=null)
				{
					System.out.print(temp.getData()+" ");
					stack.push(temp);
					temp=temp.getLeft();
				}
				temp=stack.pop().getRight();
			}
			System.out.println();
		}
		
		//inorder with stack L-N-R
		public void inOrder() 
		{
		  Stack<Node> stack=new Stack<Node>();
		  Node temp=root;
		  
		  while(temp!=null || !(stack.isEmpty()))
		  {
			  while(temp!=null)
			  {
				  stack.push(temp);
				  temp=temp.getLeft();
			  }
			  temp=stack.pop();
			  System.out.print(temp.getData()+" ");
			  temp=temp.getRight();
		  }
		  System.out.println();
		}
		//postorder with stack
		public void postOrder()
		{
			class Pair{
				Node node;
				char flag;
				 
				public Pair(Node node,char flag)
				{
					this.node=node;
					this.flag=flag;
				}
			}
			Stack<Pair> stack=new Stack<Pair>();
			Node temp=root;
			//L-R-N
			while(temp!=null || !(stack.isEmpty()))
			{
				while(temp!=null)
				{
					stack.push(new Pair(temp, 'L'));
					temp=temp.getLeft();
				}
				Pair pair=stack.pop();
				if(pair.flag=='L')
				{
					temp=pair.node.getRight();
					pair.flag='R';
					stack.push(pair);							
				}
				else
				{
					System.out.print(pair.node.getData()+" ");
				}
			}
			System.out.println();			
		}
		
		//----------DELETE-----------
		//deleting the node
		public boolean delete(int data)
		{
			if(root==null) {
				return false;
			}
			
			Node parent=root;
			Node del=root;
			//to locate del by data followed by parent
			while(del.getData()!=data)
			{
				parent=del;
				if(data<del.getData())
				{
					del=del.getLeft();
				}
				else
				{
					del=del.getRight();
				}
				if(del==null)
				{
					return false;
				}
			}		
			
			while(true) 
			{
				//checking del is terminal node? if yes deleteing it
				if(del.getLeft()==null && del.getRight()==null)
				{
					if(del==root)
					{
						root=null;
						return true;
					}
					//checking is del right or left node
					if(del==parent.getLeft())
					{
						parent.setLeft(null);
					}
					else
					{
						parent.setRight(null);
					}
					return true;
				}
				
				//if del is non terminal 
				//finding max elem from leftsub tree
				if(del.getLeft()!=null)
				{
					Node max=del.getLeft();
					parent=del;
					//max will be rightmost elem
					while(max.getRight()!=null)
					{
						parent=max;
						max=max.getRight();
					}
					//now swap del and max
					int temp=del.getData();
					del.setData(max.getData());
					max.setData(temp);
					
					del=max; //to del the node 							
				}
				else 
				{
					//now find min element from right sub tree
					Node min=del.getRight();
					parent =del;
					//min elem @leftmost elem
					while(min.getLeft()!=null)
					{
						parent=min;
						min=min.getLeft();
					}
					//swap del and min
					int temp=min.getData();
					min.setData(del.getData());
					del.setData(temp);
					
					del=min;
				}				
			}			
		}
		
		//--------get the count with recursion------
		public int getCount(Node root)
		{
			if(root==null) {
				return 0;
			}
			return 1+getCount(root.getLeft())+getCount(root.getRight());
		}
		//-----search any element--------
		public boolean search(int key)
		{
			Node temp=root;
			while(temp!=null)
			{
				if(key==temp.getData())
					return true;
				if(key<temp.getData())
				{
					temp=temp.getLeft();
				}
				else
				{
				   temp=temp.getRight();	
				}				
			}
			return false;
		}
		//search by recursion
		public boolean search(Node root,int key)
		{
			while(root!=null)
		 {
			if(root.getData()==key)
				return true;
			if(key < root.getData())
			{
				return search(root.getLeft(), key);
			}
			else
			{
				return search(root.getRight(), key);
			}
		 }
			return false;						
		}
	
}
