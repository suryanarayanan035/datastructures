package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
	
	Stack stack;
	
	@BeforeEach
	void beforeEach()
	{
		stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
	}
	
	 @Test
	 void testPush() 
	 {
		 stack.push(210);
		 stack.push(870);	
	 }

	@Test
	void testDisplay() 
	{
		stack.display();
	}
	
	@Test 
	void testPop()
	{
		assertEquals(40,stack.pop(),"Returned elemnt is different from expected element.");
		assertEquals(30,stack.pop(),"Returned elemnt is different from expected element.");
		assertEquals(20,stack.pop(),"Returned elemnt is different from expected element.");
		assertEquals(10,stack.pop(),"Returned elemnt is different from expected element.");
	}
	
	

}
