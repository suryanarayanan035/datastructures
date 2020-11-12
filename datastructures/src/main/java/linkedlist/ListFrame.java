package linkedlist;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ListFrame extends JFrame {
	
	private JButton createButton = new JButton("Initialize List");
	private JButton insertButton = new JButton("Insert Data");
	private JButton deleteButton = new JButton("Delete List");
	private JButton displayButton = new JButton("Display List");
	private JTextField insertField = new JTextField();
	private JTextField deleteField = new JTextField();
	private LinkedList list;
	public ListFrame()
	{
		setLayout(null);
		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JTable table = new JTable(list);
		table.setBounds(350, 50, 200, 400);
		add(table);
		createButton.setBounds(50, 50, 200, 50);
		insertButton.setBounds(100, 150, 200, 50);
		deleteButton.setBounds(100, 250, 200, 50);
		displayButton.setBounds(50, 350, 200, 50);
		insertField.setBounds(50, 150, 50, 50);
		deleteField.setBounds(50, 250, 50, 50);
		
		createButton.addActionListener(new LinkedListActionListener(LinkedListActionListener.INITIALIZE,this));
		insertButton.addActionListener(new LinkedListActionListener(LinkedListActionListener.INSERT,this));
		deleteButton.addActionListener(new LinkedListActionListener(LinkedListActionListener.DELETE,this));
		displayButton.addActionListener(new LinkedListActionListener(LinkedListActionListener.DISPLAY,this));
		
		add(createButton);
		add(insertButton);
		add(deleteButton);
		add(displayButton);
		add(insertField);
		add(deleteField);
		
		
	}
	
	public int getInsertField()
	{
		return Integer.parseInt(insertField.getText());
	}
	
	public int getDeleteField()
	{
		return Integer.parseInt(deleteField.getText());
	}
	
	public void setList(LinkedList l)
	{
		this.list=list;
	}
	
	public static void main(String args[])
	{
		new ListFrame();
	}

}
