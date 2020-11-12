package queue;

import org.w3c.dom.Node;

class Element
{
	int data;
	Element next;
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
		this.data = data;
	}
	
}

public class Queue {
	Element front;
	Element rear;
	
	boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
	
	void enqueue(int data)
	{
		
		if(isEmpty())
		{
			Element new_element = new Element(data);
			new_element.setNext(null);
			front = new_element;
			rear = new_element;
		}
		
		else
		{
			Element new_element = new Element(data);
			new_element.setNext(null);
			Element tmp=rear;
			tmp.setNext(new_element);
			rear=new_element;
		}
		
	}
	
	void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		
		else
		{
			Element tmp=front;
			front=tmp.getNext();
			System.out.println("Element "+tmp.getData()+" dequeued");
		}
	}
	
	void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		
		else
		{
			Element tmp=front;
			System.out.println("Element at front is :"+tmp.getData());
		}
	}
	
	void display()
	{
		Element tmp=front;
		while(tmp!=null)
		{
			System.out.println("element:"+tmp.getData());
			tmp=tmp.getNext();
		}
	}
}
