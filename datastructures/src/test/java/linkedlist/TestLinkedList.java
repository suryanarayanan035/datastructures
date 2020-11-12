package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestLinkedList {
	
	LinkedList list;
	
	@BeforeEach
	void createInstance()
	{
		list=new LinkedList();
		list.initialize(0);
		list.initialize(10);
		list.initialize(20);
		list.initialize(30);
	}

	@Test
	@DisplayName("Testin initializing function of the list")
	void testInitialize() {
		assertEquals(false,list.initialize(10),"List should be initialized only once.");
	}


	@Test
	void testDisplay() {
		assertEquals(0,list.display().getData(),"Top element is specified.");
	}

	@Test
	void testInsertAtTop() {
		
		assertEquals(true,list.insertAtTop(01),"Top Element of the list does not match,");
		
	}

	@Test
	void testInsertAt() {
		assertEquals(true, list.insertAt(01, 1),"Element should be inserted at specified position");
	}

	@Test
	void testInsert() {
		assertEquals(true, list.insertAt(01, 1),"Element should be inserted");
	}

	@Test
	void testDeleteAtStart() {
		assertEquals(0, list.deleteAtStart(),"Specified elemnt should be deleted.");
	}

	@Test
	@Disabled
	void testDeleteAtEnd() {
		assertEquals(40, list.deleteAtEnd(),"Specified elemnt should be deleted.");
	}

	@Test
	@Disabled
	void testDeleteAt() {
		System.out.println("List:"+list.size);
		assertEquals(20, list.deleteAt(3),"Specified elemnt should be deleted.");
	}

	@Test
	void testSearch() {
		assertEquals(null, list.search(90),"Specified elemnt should be deleted.");
	}

}
