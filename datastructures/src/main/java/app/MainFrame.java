package app;
import java.awt.FlowLayout;

import javax.swing.*;
public class MainFrame {
	
	public static void main(String []args)
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		JButton listButton = new JButton("Create List");
		listButton.setBounds(50, 50, 100,50);
		listButton.addActionListener(new ListActionListener("initialize"));
		frame.add(listButton);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
