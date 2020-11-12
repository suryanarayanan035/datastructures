package linkedlist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LinkedListActionListener implements ActionListener {
	static LinkedList list = new LinkedList();
	final static int INITIALIZE = 1;
	final static int INSERT = 2;
	final static int DELETE = 3;
	final static int INSERT_AT = 4;
	final static int DISPLAY = 5;
	int operation;
	ListFrame frame;
	public LinkedListActionListener(int operation,ListFrame frame) {
		this.operation=operation;
		this.frame=frame;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
			
		switch(operation)
		{
			case INITIALIZE:
				createList();
				break;
			case INSERT:
				insert(frame.getInsertField());
				break;
			case DELETE:
				delete(frame.getDeleteField());
				break;
			case DISPLAY:
				display();
				break;
		}
		
	}
	
	public void createList() throws NullPointerException
	{
		list.initialize(5);
	}
	public void insert(int data)
	{
		list.insert(data);
	}
	public void delete(int index)
	{
		list.deleteAt(index);
	}
	public void display()
	{
		list.display();
	}
	
	

}

