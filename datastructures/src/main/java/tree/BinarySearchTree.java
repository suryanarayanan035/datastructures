package tree;

class Node
{
	int data;
	Node left=null;
	Node right=null;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node(int data) {
		
		this.data = data;
	}
	
}

public class BinarySearchTree {
	Node root=null;
	
	public void insertNode(int data)
	{
		Node new_node = new Node(data);
		if(root==null)
		{
			
			root=new_node;
		}
		else
		{
			Node tmp=root;
			while(tmp!=null)
			{
				if(tmp.getData() == data)
				{
					return;
			
				}
				
				else if(data > tmp.getData() && tmp.getRight()==null)
				{
					tmp.setRight(new_node);
					System.out.println("Data set is "+data);
					break;
				}
				
				else if(data > tmp.getData())
				{
					tmp=tmp.getRight();
				}
				
				else if(data < tmp.getData()&& tmp.getLeft()==null)
				{
					tmp.setLeft(new_node);
					System.out.println("Data set is "+data);
					break;
				}
				else
				{
					tmp=tmp.getLeft();
				}
			}
			
		}
	}
	
	public void preOrderDisplay(Node node)
	{
		if(node!=null) {
		System.out.println(node.getData()+",");
		
		if(node.getLeft()==null  && node.getRight()==null)
		{
			return;
			
		}
		if(node.getLeft()!=null)
		{
			preOrderDisplay(node.getLeft());
		}
		
		if(node.getRight()!=null)
		{
			
			preOrderDisplay(node.getRight());
		}
	}
		}
	public void inOrderDisplay(Node node)
	{
		if(node!=null)
		{
			inOrderDisplay(node.getLeft());
			System.out.println(node.getData()+",");
			inOrderDisplay(node.getRight());
		}
	}
	
	public void delete(int data)
	{
		Node tmp=root;
		
		if(tmp.getData() > data)
		{
			while(tmp!=null)
			{
				if(tmp.getData()==data)
				{
					recursiveDelete(tmp);
					break;
				}
				tmp=tmp.getRight();
			}
			
		}
		
		else if(tmp.getData() < data)
		{
			
		}
	}
	
	public void recursiveDelete(Node node)
	{
		if(node.getLeft()==null && node.getRight()==null)
		{
			
		}
	}
	
	public static void main(String []args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(8);
		bst.insertNode(3);
		bst.insertNode(10);
		bst.insertNode(11);
		bst.insertNode(4);
		bst.insertNode(25);
		bst.inOrderDisplay(bst.root);
	}
}
