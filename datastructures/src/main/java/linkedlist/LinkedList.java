package linkedlist;



class Node
{
	private int data;
	private Node next;
	public int getData() { return data; }
	public void setData(int data) { this.data = data; }
	public Node getNext() { return next; }
	public void setNext(Node next) { this.next = next;}
	public Node(int data) {
		this.data = data;
	}
	
	
	
}



public class LinkedList {
	
	
	Node head = null;
	int size=0;
	
	public boolean initialize(int data) 
	{
		if(head==null)
		{
			head=new Node(data);
			head.setNext(null);
			size++;
			System.out.println("List intialize with element:"+data);
			return true;
		}
			
		else
		{
			System.out.println("List Already initialized");
			return false;
		}
			
	}
	
	public boolean add(int data)
	{
		if(head==null)
			return initialize(data);
		else
		{
			Node tmp=head;
			Node new_node = new Node(data);
			new_node.setNext(null);
			while(tmp.getNext()!=null)
			{
				tmp=tmp.getNext();
			}
			tmp.setNext(new_node);
			size++;
			return true;
		}
	}
	
	public Node display()
	{
		if(head==null)
		{
			System.out.println("List is Empty ");
			return null;
			
		}
		
		else
		{
			Node tmp=head;
			while(tmp!=null)
			{
				System.out.println("Element:"+tmp.getData());
				tmp=tmp.getNext();
			}
			return head;
		}
		
		
	}
	
	public boolean insertAtTop(int data)
	{
		if(head==null)
		{
			return initialize(data);
		}
		else
		{
			Node new_node = new Node(data);
			Node tmp = head;
			new_node.setNext(tmp);
			head=new_node;
			size++;
			return true;
		}
	}
	public boolean insertAt(int data,int index)
	{
		if(index > size)
		{
			System.out.println("Index out of bounds.");
			return  false;
		}
		else
		{
			Node new_node = new Node(data);
			Node tmp = head;
			for(int i=0;i<index-1;i++)
			{
				tmp=tmp.getNext();
			}
			new_node.setNext(tmp.getNext());
			tmp.setNext(new_node);
			size++;
			return true;
		}
	}
	public boolean insert(int data)
	{
		if(head==null)
		{
			return initialize(data);
		}
		else
		{
			Node new_node = new Node(data);
			new_node.setNext(null);
			Node tmp = head;
			while(tmp.getNext()!=null)
			{
				tmp=tmp.getNext();
			}
			tmp.setNext(new_node);
			size++;
			return true;
		}
	}
	
	public Integer deleteAtStart()
	{
		if(head==null)
		{
			System.out.println("List is Empty.");
			return  null;
		}
		else
		{
			int data=head.getData();
			head=head.getNext();
			size--;
			return data;
		}
	}
	
	public Integer deleteAtEnd()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return  null;
		}
			
		else
		{
			Node tmp=head;
			int data;
			for(int i=1;i<size-1;i++)
			{
				tmp=tmp.getNext();
			}
			data=tmp.getNext().getData();
			tmp.setNext(null);
			size--;
			return data;
		}
	}
	
	public Integer deleteAt(int index)
	{
		if(index > size)
		{
			System.out.println("Index out of bounds");
			return null;
		}
				
		else
		{
			Node tmp = head;
			Node tmp2 = null;
			for(int i=1;i<index-1;i++)
			{
				tmp=tmp.getNext();
			}
			tmp2=tmp.getNext();
			tmp.setNext(tmp2.getNext());
			return 1;
		}
	}
	
	public Integer search(int data)
	{
		int i=1;
		Node tmp=head;
		while(tmp!=null)
		{
			if(tmp.getData()==data)
			{
				System.out.println("ELement"+data+" is found at:"+i);
				break;
			}
			tmp=tmp.getNext();
			i++;
		}
		if(tmp==null)
		{
			System.out.println("Element not found");
			return  null;
		}
		else
		{
			return tmp.getData();
		}
	}
	
	public Node peek()
	{
		if(head==null)
		{
			return null;
		}
		else
		{
			return head;
		}
	}
	
}


