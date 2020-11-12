package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import linkedlist.LinkedList;

public class ListActionListener implements ActionListener {
	static LinkedList list = new LinkedList();
	String operation;
	public ListActionListener(String operation) {
		this.operation=operation;
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
			
		if(operation=="initialize")
		{
			createList();
		}
		
	}
	
	public void createList()
	{
		list.initialize(5);
	}

}

