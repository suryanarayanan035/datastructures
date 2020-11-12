package app;

import java.util.Scanner;

import linkedlist.LinkedList;

public class Console {
	static LinkedList list=new LinkedList();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int option=0;
		System.out.println("Enter the option no of operation you want to perform");
		
	}
	
	public void consoleScreen()
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		int data;
		System.out.println("Enter the option no of operation you want to perform");
		System.out.println("1.Create a List");
		System.out.println("2.Insert data into list");
		System.out.println("3.Remove element from list");
		System.out.println("4.Display");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the data you want to add to the list:");
			data=sc.nextInt();
			list.initialize(5);
			consoleScreen();
		case 2:
			System.out.println("Enter the data you want to add to the list:");
			data=sc.nextInt();
			consoleScreen();
		case 3:
			System.out.println("Enter the data you want to add to the list:");
			data=sc.nextInt();
			consoleScreen();
		case 4:
			System.out.println("Enter the data you want to add to the list:");
			data=sc.nextInt();
			consoleScreen();
		case 5:
			System.exit(0);
		default:
			System.out.println("Enter a valid option.");
			consoleScreen();
			
		}
	}
}
