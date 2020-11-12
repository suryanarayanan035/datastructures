package queue;
import java.util.Scanner;

public class Main {
	static Queue queue=new Queue();
	public static void main(String[] args) {
		consoleScreen();
		
	}
	
	public static void consoleScreen()
	{
		Scanner sc=new Scanner(System.in);
		int option=0;
		int data;
		System.out.println("Enter the option no of operation you want to perform");
		System.out.println("1.EnQueue");
		System.out.println("2.DeQueue");
		System.out.println("3.Display");
		System.out.println("4.Peek");
		System.out.println("5.Exit");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter the data you want to add to the Queue:");
			data=sc.nextInt();
			queue.enqueue(data);
			consoleScreen();
		case 2:
			queue.dequeue();
			consoleScreen();
		case 3:
			queue.display();
			consoleScreen();
		case 4:
			queue.peek();
			consoleScreen();
		case 5:
			System.exit(0);
		default:
			System.out.println("Enter a valid option.");
			consoleScreen();
			
		}
	}
}
