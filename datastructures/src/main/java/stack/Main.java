package stack;
import java.util.Scanner;

public class Main {
	static Stack stack=new Stack();
	public static void main(String[] args) {
		consoleScreen();
		
	}
	
	public static void consoleScreen()
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		int data;
		System.out.println("Enter the option no of operation you want to perform");
		System.out.println("1Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		System.out.println("4.Peek");
		System.out.println("5.Exit");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the data you want to add to push:");
			data=sc.nextInt();
			stack.push(data);
			consoleScreen();
		case 2:
			stack.pop();
			consoleScreen();
		case 3:
			stack.display();
			consoleScreen();
		case 4:
			stack.peek();
			consoleScreen();
		case 5:
			System.exit(0);
		default:
			System.out.println("Enter a valid option.");
			consoleScreen();
			
		}
	}
}