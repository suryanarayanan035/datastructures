package stack;

class Element
{
	private int data;
	private Element next=null;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		this.next = next;
	}
	public Element(int data) {
		super();
		this.data = data;
	}
	
	
}

public class Stack {
	Element top=null;
	void push(int data)
	{
		
		if(isEmpty())
		{
			Element new_element=new Element(data);
			new_element.setNext(null);
			top=new_element;
		}
		
		else
		{
			Element tmp=top;
			Element new_element = new Element(data);
			new_element.setNext(tmp);
			top=new_element;
		}
	}
	
	int pop()
	{
		int tmp;
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return (Integer) null;
				
		}
		else
		{
			tmp=top.getData();
			System.out.println("Element popped:"+tmp);
			top=top.getNext();
			return tmp;
		}	
			
	}
	
	boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Element at top:"+top.getData());
		}
		
	}
	
	
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else 
		{
			Element tmp=top;
			while(tmp!=null)
			{
				System.out.println("Element:"+tmp.getData());
				tmp=tmp.getNext();
			}
		}
	}
	

}
